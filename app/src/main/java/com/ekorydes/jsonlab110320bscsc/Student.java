package com.ekorydes.jsonlab110320bscsc;

import androidx.fragment.app.Fragment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Student {

    @SerializedName("name")
    private String stuName;

    @SerializedName("roll")
    @Expose(serialize = true)
    private int stuRollNo;

    @SerializedName("subject")
    private ArrayList<Subject> list;

//    public Student(String stuName, int stuRollNo, Subject objectSubject) {
//        this.stuName = stuName;
//        this.stuRollNo = stuRollNo;
//        this.objectSubject = objectSubject;
//    }


    public Student(String stuName, int stuRollNo, ArrayList<Subject> list) {
        this.stuName = stuName;
        this.stuRollNo = stuRollNo;
        this.list = list;
    }
}