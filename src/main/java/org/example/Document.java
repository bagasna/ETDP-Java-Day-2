package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Document {
    private String[] authors = {"Auth Pasca", "Auth Arigo"};
    private Date date = new Date();

    public String[] getAuthors(){
        return authors;
    }
    public void addAuthor(String name){
        List<String> listAuthors = new ArrayList<String>(Arrays.asList(this.authors));
        listAuthors.add(name);
        String[] hasil = new String[listAuthors.size()];
        this.authors = listAuthors.toArray(hasil);
    }

    public Date getDate(){
        return date;
    }


}
