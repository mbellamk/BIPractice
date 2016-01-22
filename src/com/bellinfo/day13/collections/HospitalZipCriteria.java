package com.bellinfo.day13.collections;

import java.util.Comparator;

public class HospitalZipCriteria implements Comparator<Hospital> {

	@Override
	public int compare(Hospital m1, Hospital m2) {

		return m1.getAddress().getZipCode() - m2.getAddress().getZipCode();
	}
}
