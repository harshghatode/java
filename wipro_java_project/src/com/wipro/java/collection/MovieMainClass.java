package com.wipro.java.collection;
import java.util.ArrayList;
import java.util.Collections;

public class MovieMainClass {
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