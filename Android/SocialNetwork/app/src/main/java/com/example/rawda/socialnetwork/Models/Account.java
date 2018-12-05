package com.example.rawda.socialnetwork.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date dateOfBirth;
    private String profilePhoto; // photo path
    private ArrayList<Account> friends;
    private ArrayList<Account> followers;
    private ArrayList<Account> following;
    private ArrayList<Post> posts;
    private ArrayList<Message> messages;

    public Account(String email, String password){
        this.email = email;
        this.password = password;
        firstName = "";
        lastName = "";
        dateOfBirth = new Date();
        profilePhoto = "";
        friends = new ArrayList<>();
        followers = new ArrayList<>();
        following = new ArrayList<>();
        posts = new ArrayList<>();
        messages = new ArrayList<>();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public void setFriends(ArrayList<Account> friends) {
        this.friends = friends;
    }

    public void setFollowers(ArrayList<Account> followers) {
        this.followers = followers;
    }

    public void setFollowing(ArrayList<Account> following) {
        this.following = following;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public ArrayList<Account> getFriends() {
        return friends;
    }

    public ArrayList<Account> getFollowers() {
        return followers;
    }

    public ArrayList<Account> getFollowing() {
        return following;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", profilePhoto='" + profilePhoto + '\'' +
                ", friends=" + friends +
                ", followers=" + followers +
                ", following=" + following +
                ", posts=" + posts +
                ", messages=" + messages +
                '}';
    }
}