package com.example.nickng.demolistview;

/**
 * Created by 15056201 on 27/4/2017.
 */

public class Food {
    private String name;
    private boolean star;
    public Food(String name, boolean star) {
        this.name = name;
        this.star = star;
    }

    public String getName(){
        return name;
    }

    public boolean isStar(){
        return star;
    }
}
