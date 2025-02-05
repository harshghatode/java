package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Rate implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m2.getRating(), m1.getRating());  // Descending order
    }
    public static void main(String[] args) {
    	// Create a list of movies
    	ArrayList<Movie> movies = new ArrayList<>();
    	movies.add(new Movie("Force Awakens", 8.3, 2015));
    	movies.add(new Movie("Star Wars", 8.7, 1977));
    	movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
    	
    	// Sort by rating (Descending)
    	Collections.sort(movies, new Rate());
    	System.out.println("Movies sorted by rating (Descending order):");
    	for (Movie m : movies) {
    		System.out.println(m.getRating() + " " + m.getName() + " " + m.getYear());
    	}
    	
    }
}