package com.bellinfo.day13.collections;

import java.util.Comparator;

public class NameAndRatingBasedCriteria implements Comparator<Movies> {

	@Override
	public int compare(Movies m1, Movies m2) {

		int nameVal = m1.getName().compareTo(m2.getName());
		if (nameVal == 0) {
			return m1.getRating() - m2.getRating();
		}
		return nameVal;
	}

}
