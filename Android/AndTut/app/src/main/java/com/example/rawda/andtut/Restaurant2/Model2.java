package com.example.rawda.andtut.Restaurant2;

public class Model2 {
    private String s1;
    private String s2;

    public Model2(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    @Override
    public String toString() {
        return s1 + " " + s2;
    }
}
