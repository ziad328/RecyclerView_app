package com.example.recyclerview;

public class Post {
    private String userName;
    private String date;
    private String content;
    private int image;

    public Post(String userName, String date, String content, int image) {
        this.userName = userName;
        this.date = date;
        this.content = content;
        this.image = image;
    }

    public String getUserName() {
        return userName;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public int getImage() {
        return image;
    }
}

