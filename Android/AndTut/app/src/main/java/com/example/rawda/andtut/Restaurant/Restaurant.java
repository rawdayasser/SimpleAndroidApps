package com.example.rawda.andtut.Restaurant;

public class Restaurant {
    private String name;
    private String address;
    private String type;

    public Restaurant() {
        name = "";
        address = "";
        type = "";

    }

    public Restaurant(String name, String address, String type) {
        this.name = name;
        this.address = address;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

}
