package com.wipro.java.collection;
import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
    private String n;  // Movie Name
    private double r;  // Movie Rating
    private int y;     // Release year

    // Constructor
    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // CompareTo method for sorting by rating in ascending order
    public int compareTo(Movie m) {
        return Double.compare(this.r, m.r); // Sorting by rating
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

    public static void main(String[] args) {
        // Create a list of movies
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Star Wars", 8.7, 1977));
        movies.add(new Movie("Return of the Jedi", 8.4, 1983));
        movies.add(new Movie("Empire Strikes Back", 8.8, 1980));

        // Sort movies by rating using Comparable's compareTo method
        Collections.sort(movies);

        // Display sorted list
        System.out.println("Movies after sorting by rating (Ascending order):");
        for (Movie m : movies) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}