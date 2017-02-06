package com.example.rajan.codekulapplication;

import java.util.ArrayList;

/**
 * Created by rajan on 25/1/17.
 */

public class jokeinfo {

    private String id;
    private String technologyName;
    private ArrayList<String> categories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

}
