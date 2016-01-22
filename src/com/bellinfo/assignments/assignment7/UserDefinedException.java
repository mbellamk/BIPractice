package com.bellinfo.assignments.assignment7;

import java.util.Calendar;
import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		try {
			CardDetails cardInfo = receiveCardDetails();

			verifyCardDetails(cardInfo);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static CardDetails receiveCardDetails() {
		CardDetails cardInfo = new CardDetails();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your card number");
		cardInfo.setCardNumber(scan.next());
		System.out.println("Enter expiry Date");
		cardInfo.setExpiryDate(scan.next());
		System.out.println("Enter your CVV Number");
		cardInfo.setCvv(scan.nextInt());
		return cardInfo;
	}

	static void verifyCardDetails(CardDetails cardInfo)
			throws CardInvalidException, CVVInvalidException,
			InvalidExpiryDateException {
		boolean status = true;
		if (cardInfo.getCardNumber().length() != 16) {

			status = false;
			throw new CardInvalidException(cardInfo.getCardNumber());
		}

		Integer i = cardInfo.getCvv();
		if (i.toString().length() != 3) {

			status = false;
			throw new CVVInvalidException(cardInfo.getCvv());
		}

		String[] date = cardInfo.getExpiryDate().split("/");
		Calendar cal = Calendar.getInstance();
		int currentMonth = cal.get(cal.MONTH);
		int currentYear = cal.get(cal.YEAR);
		if (date.length != 2 || Integer.parseInt(date[0]) < currentMonth
				|| Integer.parseInt(date[1]) < currentYear) {

			status = false;
			throw new InvalidExpiryDateException(cardInfo.getExpiryDate());
		}
		if (status) {
			System.out
					.println("Your card has been accepted. And your product will be delivered soon");

		}
	}

}

class CardDetails {
	private int cvv;
	private String cardNumber;
	private String expiryDate;

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
