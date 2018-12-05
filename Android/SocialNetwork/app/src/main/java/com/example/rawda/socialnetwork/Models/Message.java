package com.example.rawda.socialnetwork.Models;

public class Message {
    private int id;
    private String content;
    private Account owner;
    private Account receiver;

    public Message(int id, String content, Account owner, Account receiver) {
        this.id = id;
        this.content = content;
        this.owner = owner;
        this.receiver = receiver;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Account getOwner() {
        return owner;
    }

    public Account getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", owner=" + owner +
                ", receiver=" + receiver +
                '}';
    }
}
