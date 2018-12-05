package com.example.rawda.socialnetwork.Models;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private int id;
    private Account owner;
    private Date date;
    private String content;
    private ArrayList<Like> likes;
    private static int numberOfLikes = 0;

    public Post(Account owner, Date date, String content) {
        this.owner = owner;
        this.date = date;
        this.content = content;
        likes = new ArrayList<>();
        numberOfLikes++;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikes(ArrayList<Like> likes) {
        this.likes = likes;
    }

    public static void setNumberOfLikes(int numberOfLikes) {
        Post.numberOfLikes = numberOfLikes;
    }

    public int getId() {
        return id;
    }

    public Account getOwner() {
        return owner;
    }

    public Date getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public ArrayList<Like> getLikes() {
        return likes;
    }

    public static int getNumberOfLikes() {
        return numberOfLikes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", owner=" + owner +
                ", date=" + date +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }
}
