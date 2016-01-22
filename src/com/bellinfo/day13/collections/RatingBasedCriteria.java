package com.bellinfo.day13.collections;

import java.util.Comparator;

public class RatingBasedCriteria implements Comparator<Movies> {

	@Override
	public int compare(Movies m1, Movies m2) {

		return m1.getRating()-m2.getRating();
	}

}
