package com.codeup.adlister.models;

public class Category {

    private long id;
    private String type;

    public Category(long id, String type){
        this.id = id;
        this.type = type;
    }

    public Category(String type){
        this.type = type;
    }

    public long getCategoryId() {
        return id;
    }

    public void setCategoryId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
