package com.bellinfo.day13.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import sun.print.resources.serviceui;

public class ComparatorScenarios {

	public static void main(String args[]) {

		
		List<Movies> movies = new ArrayList<>();
		Movies m1 = new Movies();
		m1.setName("NPT");
		m1.setRating(4);
		m1.setLanguage("Telugu");
		movies.add(m1);

		m1 = new Movies();
		m1.setName("BB");
		m1.setRating(3);
		m1.setLanguage("Telugu");
		movies.add(m1);

		m1 = new Movies();
		m1.setName("SSR");
		m1.setRating(4);
		m1.setLanguage("Telugu");
		movies.add(m1);

		m1 = new Movies();
		m1.setName("SSR");
		m1.setRating(2);
		m1.setLanguage("English");
		movies.add(m1);

		Collections.sort(movies, new NameBasedCriteria());
		System.out.println(movies.toString());

		Collections.sort(movies, new RatingBasedCriteria());
		System.out.println(movies.toString());
		Set<Movies> movieSet = new TreeSet<>(new NameBasedCriteria());
		
		movieSet.addAll(movies);
		System.out.println(movies.toString());

		Collections.sort(movies, new NameAndRatingBasedCriteria());
		System.out.println(movies.toString());
		
		

	}
}

class Movies {

	private String name;
	private int rating;
	private String language;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", rating=" + rating + ", language="
				+ language + "]";
	}

}
