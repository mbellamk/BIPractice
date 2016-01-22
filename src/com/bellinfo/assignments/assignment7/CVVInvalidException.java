package com.bellinfo.assignments.assignment7;

public class CVVInvalidException extends Exception {

	private static final long serialVersionUID = 5097322855876800864L;

	private int cvv;

	public CVVInvalidException(int cvv) {
		this.cvv = cvv;
	}

	public String toString() {
		return "CVV must contain 3 digits";
	}
}
