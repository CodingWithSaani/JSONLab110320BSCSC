package com.ekorydes.jsonlab110320bscsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Uni objectUni=new Uni("Superior",2002);
//        Gson objectGson=new Gson();
//
//        String resultOfJSON=objectGson.toJson(objectUni);
//        String myJson="{\"stuName\":\"Ali\",\"stuRollNo\":1,\"stuSubject\":\"MAD\"}";
//
//
//        Student objectNewStudent=objectGson.fromJson(myJson,Student.class);
//        TextView textView=findViewById(R.id.TV);
//
//        textView.setText("Name:"+objectNewStudent.getStuName()+"\n"
//        +"Roll No:"+objectNewStudent.getStuRollNo()+"\n"
//        +"Subject:"+objectNewStudent.getStuSubject());


//        Uni myUni=new Uni("Superior",2002,
//                new UniDepartment("CS"));
//        Gson objectGson=new Gson();
//
//        String myUniInJsonFormat=objectGson.toJson(myUni);
//        String newMyJson="{\"name\":\"Hamza\",\"roll\":1," +
//                "\"subject\":{\"subject\":\"MAD\"}}";
//
//        Student objectDeSerializedStudent=objectGson.fromJson(newMyJson,Student.class);

        ArrayList<Subject> list=new ArrayList<>();
        list.add(new Subject("MAD"));
        list.add(new Subject("WAD"));
        list.add(new Subject("SAD"));

        Student student=new Student("Ali",1,list);
        Gson objectGson=new Gson();

        Gson objectExposeJson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        String myString=objectExposeJson.toJson(student);
        String newMyJson="{\"name\":\"Hamza\",\"roll\":1," +
               "\"subject\":[{\"subject\":\"MAD\"},{\"subject\":\"WAD\"}]}";

        Student objectDeSerializedStudent=objectGson.fromJson(newMyJson,Student.class);

        //String jsonArrayList="[{\"subject\":\"MAD\"},{\"subject\":\"WAD\"}]";

        //Subject[] subjects=objectGson.fromJson(jsonArrayList,Subject[].class);

//        Type myType=new TypeToken<ArrayList<Subject>>(){}.getType();
//        ArrayList<Subject> subjectArrayList=objectGson.fromJson(jsonArrayList,myType);


    }













}
