package com.example.rajan.codekulapplication;

import java.util.ArrayList;

/**
 * Created by rajan on 28/1/17.
 */

public class jokeinfo1 {

    private String id;
    private String technologyName;
    private ArrayList<String> categories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJoke() {
        return technologyName;
    }

    public void setJoke(String joke) {
        this.technologyName = joke;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }
}
