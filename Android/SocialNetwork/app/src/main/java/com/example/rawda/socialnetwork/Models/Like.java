package com.example.rawda.socialnetwork.Models;

import java.util.Date;

public class Like {
    private int id;
    private Account owner;
    private Post post;
    private Date date;

    public Like(int id, Account owner, Post post, Date date) {
        this.id = id;
        this.owner = owner;
        this.post = post;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Account getOwner() {
        return owner;
    }

    public Post getPost() {
        return post;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", owner=" + owner +
                ", post=" + post +
                ", date=" + date +
                '}';
    }
}
