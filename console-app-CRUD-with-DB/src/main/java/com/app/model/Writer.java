package com.app.model;

import java.util.List;

public class Writer {
    private Integer id;
    private String firsName;
    private String lastName;
    private List<Post> posts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Post> getPosts() {
        return posts;
    }


    public void setName(String firsName, String lastName, List<Post> posts) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.posts = posts;
    }
}
