package com.wipro.java.collection;

public class Movie1
{
    private String n;  // Movie Name
    private double r;  // Movie Rating
    private int y;     // Release Year

    // Constructor
    public Movie1(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // Getter methods
    public String getName() {
        return n;
    }

    public double getRating() {
        return r;
    }

    public int getYear() {
        return y;
    }
}