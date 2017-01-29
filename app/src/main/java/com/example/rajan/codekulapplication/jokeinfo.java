package com.example.rajan.codekulapplication;

import java.util.ArrayList;

/**
 * Created by rajan on 25/1/17.
 */

public class jokeinfo {

    private String id;
    private String joke;
    private ArrayList<String> categories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }
}
