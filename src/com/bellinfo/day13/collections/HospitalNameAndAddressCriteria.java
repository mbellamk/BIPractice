package com.bellinfo.day13.collections;

import java.util.Comparator;

public class HospitalNameAndAddressCriteria implements Comparator<Hospital> {

	@Override
	public int compare(Hospital m1, Hospital m2) {

		if (m1.getName().compareTo(m2.getName()) == 0) {
			Address address1 = m1.getAddress();
			Address address2 = m2.getAddress();
			if (address1.getAddress1().compareTo(address2.getAddress2()) == 0
					&& address1.getAddress2().compareTo(address2.getAddress2()) == 0
					&& address1.getCity().compareTo(address2.getCity()) == 0
					&& address1.getState().compareTo(address2.getState()) == 0
					&& address1.getZipCode() - address2.getZipCode() == 0) {
				return 0;
			} else {
				return address1.getZipCode() - address2.getZipCode();
			}
		}
		return m1.getName().compareTo(m2.getName());
	}
}
