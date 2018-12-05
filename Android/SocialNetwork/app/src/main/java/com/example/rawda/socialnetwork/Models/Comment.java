package com.example.rawda.socialnetwork.Models;

import java.util.ArrayList;
import java.util.Date;

public class Comment {
    private int id;
    private Account owner;
    private String content;
    private Date date;
    ArrayList<Like> likes;

    public Comment(int id, Account owner, String content) {
        this.id = id;
        this.owner = owner;
        this.content = content;
        date = new Date();
        likes = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLikes(ArrayList<Like> likes) {
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public Account getOwner() {
        return owner;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Like> getLikes() {
        return likes;
    }
    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", owner=" + owner +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", likes=" + likes +
                '}';
    }
}
