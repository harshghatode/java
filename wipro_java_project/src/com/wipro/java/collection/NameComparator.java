package com.wipro.java.collection;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
class NameComparator implements Comparator<Movie> {
	    public int compare(Movie m1, Movie m2) {
	        return m1.getName().compareTo(m2.getName());  // Alphabetical order
	    }
	    public static void main(String[] args) {
	        // Create a list of movies
	        ArrayList<Movie> movies = new ArrayList<>();
	        movies.add(new Movie("Force Awakens", 8.3, 2015));
	        movies.add(new Movie("Star Wars", 8.7, 1977));
	        movies.add(new Movie("Empire Strikes Back", 8.8, 1980));

	     

	        // Sort by name (Alphabetical order)
	        Collections.sort(movies, new NameComparator());
	        System.out.println("\nMovies sorted by name (Alphabetical order):");
	        for (Movie m : movies) {
	            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
	        }
	    }
	}