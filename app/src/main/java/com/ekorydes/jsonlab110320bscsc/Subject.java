package com.ekorydes.jsonlab110320bscsc;

import com.google.gson.annotations.SerializedName;

public class Subject {

    @SerializedName("subject")
    private String stuSubject;

    public Subject(String stuSubject) {
        this.stuSubject = stuSubject;
    }
}
