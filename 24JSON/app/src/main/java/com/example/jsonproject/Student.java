package com.example.jsonproject;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Student {
    private String name;
    @SerializedName("courseCount")
    private int course_count;
    private String email;

//    @SerializedName("course")
//    private Course mCourse;
//
//    @SerializedName("video")
//    private List<Video> mVideo;

    public Student(String name, int courseCount, String email) {
        this.name = name;
        this.course_count = courseCount;
        this.email = email;
//        mCourse = course;
//        mVideo = video;
    }
}
