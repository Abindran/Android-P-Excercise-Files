package com.example.myapihandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

//        requestQueue = Volley.newRequestQueue(this);
        requestQueue =  VolleySingleton.getInstance(this).getRequestQueue();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                textView.setText("hi");
                sendAPIRequest();
            }
        });
    }
    private void sendAPIRequest(){
        String url = "https://myjson.dit.upm.es/api/bins/6o3x";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray = response.getJSONArray("students");
                    for(int i=0;i<jsonArray.length();i++){
                        JSONObject student = jsonArray.getJSONObject(i);
                        String name = student.getString("name");
                        int courseCount = student.getInt("courseCount");
                        String email = student.getString("email");
                        textView.append(name + ", " + String.valueOf(courseCount) + ", " + email + "\n");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("That didn't work");

            }
        });

        requestQueue.add(request);
    }
}