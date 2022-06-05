package com.example.jsonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
//        Student student = new Student("Abindran",22,"abindranr@gmail.com");
//        String json = gson.toJson(student);

//        String json = "{\"courseCount\":22,\"email\":\"abindranr@gmail.com\",\"name\":\"Abindran\"}";
//        Student student = gson.fromJson(json,Student.class);
//
//        Log.d("TEST",json);
//        List<Video> videos = new ArrayList<>();
//        videos.add(new Video("Intro",4));
//        videos.add(new Video("Exercise files",6));
//        videos.add(new Video("Installation",14));
//        videos.add(new Video("Explanation",24));

//        Course course = new Course("Java","Bootcamp");
//
//        Student student = new Student("Abindran",11,"abindran@lco.in",course,videos);
//
//        String json = gson.toJson(student);

//        String json = "{\"courseCount\":11,\"email\":\"abindran@lco.in\",\"course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"video\":[{\"duration\":4,\"name\":\"Intro\"},{\"duration\":6,\"name\":\"Exercise files\"},{\"duration\":14,\"name\":\"Installation\"},{\"duration\":24,\"name\":\"Explanation\"}],\"name\":\"Abindran\"}";

//        Student student = gson.fromJson(json,Student.class);




//        Log.d("test",student.toString());
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hitesh",4,"hitesh@hiteshChoudary.com"));
        students.add(new Student("Shubham",3,"shubham@example.com"));
        students.add(new Student("Harry",2,"harry@email.com"));
        students.add(new Student("Mike",5,"mike@example.com"));
        students.add(new Student("Annie",3,"annie@example.com"));
        ApiHandlerJson apiHandlerJson = new ApiHandlerJson(students);
        String json = gson.toJson(apiHandlerJson);

        Log.d("test",json);
    }
}