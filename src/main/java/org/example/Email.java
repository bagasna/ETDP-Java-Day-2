package org.example;

import java.util.ArrayList;

public class Email extends Document{
    private String subject = "Training Java Day 2";
    private String[] to = {"bagas@gmail.com", "Fadhel@gmail.com"};

    public String getSubject(){
        return subject;
    }

    public String[] getTo(){
        return to;
    }

}
