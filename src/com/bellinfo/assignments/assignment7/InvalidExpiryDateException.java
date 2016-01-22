package com.bellinfo.assignments.assignment7;

public class InvalidExpiryDateException extends Exception {

	private static final long serialVersionUID = 5097322855876800864L;

	private String expiryDate;

	public InvalidExpiryDateException(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String toString() {
		return "It seems your card is already expired. Please enter new card details and try again.";
	}
}
