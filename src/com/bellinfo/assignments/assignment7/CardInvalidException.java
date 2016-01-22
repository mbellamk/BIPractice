package com.bellinfo.assignments.assignment7;

public class CardInvalidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 343878251134362313L;
	
	private String cardNumber;

	public CardInvalidException(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String toString() {
		if (cardNumber != null) {
			return "invalid card number entered" + cardNumber
					+ " card number must be of size 16";
		}
		return "invalid card number. Enter valid Card Number of size 16";
	}
}
