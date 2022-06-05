package com.example.sqlitestudentrecorder;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDB;
    EditText editText_id,editText_name,editText_email,editText_courseCount;
    Button button_add,button_getData,button_update,button_delete,button_viewAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDB = new DatabaseHelper(this);
        editText_id = findViewById(R.id.editText_id);
        editText_name = findViewById(R.id.editText_name);
        editText_email = findViewById(R.id.editText_email);
        editText_courseCount = findViewById(R.id.editText_CC);

        button_add = findViewById(R.id.button_add);
        button_delete = findViewById(R.id.button_delete);
        button_update = findViewById(R.id.button_update);
        button_getData = findViewById(R.id.button_view);
        button_viewAll = findViewById(R.id.button_viewAll);

        AddData();
        getData();
        viewAll();
        updateDate();
        deleteData();
    }
    public void AddData(){
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String myEmail = editText_email.getText().toString();
                boolean isInserted = myDB.insertData(editText_name.getText().toString(),editText_email.getText().toString(),editText_courseCount.getText().toString());
                if(isInserted == true){
                    Toast.makeText(MainActivity.this,"Data Inserted!!!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Something went wrong..",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void getData(){
        button_getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = editText_id.getText().toString();
                if(id.equals(String.valueOf(""))){
                    editText_id.setError("Enter ID");
                    return;
                }


                Cursor cursor = myDB.getData(id);
                String data = null;
                if(cursor.moveToNext()){
                    if(cursor.getCount() == 0){
                        showMessage("Error","No data found in that index!!!");
                        return;
                    }
                    data = "ID: " + cursor.getString(0) + "\n" +
                            "Name: " + cursor.getString(1) + "\n"+
                            "Email: " + cursor.getString(2) +"\n"+
                            "CourseCount: " + cursor.getString(3);
                }
                showMessage("Data: ",data);

            }
        });
    }

    public void  viewAll(){
        button_viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor = myDB.getAllData();
                StringBuffer buffer = new StringBuffer();
                if(cursor.getCount() == 0){
                    showMessage("Error","Nothing found in db");
                    return;
                }
                while (cursor.moveToNext()){
                    buffer.append("ID: "+cursor.getString(0) + "\n");
                    buffer.append("Name: "+cursor.getString(1) + "\n");
                    buffer.append("Email: "+cursor.getString(2) + "\n");
                    buffer.append("Course Count: "+cursor.getString(3) + "\n");
                }
                showMessage("All Data",buffer.toString());
            }
        });
    }

    public void updateDate(){
        button_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isUpdate = myDB.updateData(editText_id.getText().toString(),editText_name.getText().toString(),editText_email.getText().toString(),editText_courseCount.getText().toString());
                if(isUpdate == true){
                    Toast.makeText(MainActivity.this,"Update successfully",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Ooops...Error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void deleteData(){
        button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = editText_id.getText().toString();
                if(id.equals(String.valueOf(""))){
                    editText_id.setError("Enter ID");
                    return;
                }

                Integer deletedRow  = myDB.deleteData(editText_id.getText().toString());

                if(deletedRow>0){
                    Toast.makeText(MainActivity.this,"Delete Success",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"OOPS....",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void showMessage(String title,String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

}