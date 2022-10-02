package ch_04;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 4.21 (Check SSN) Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit.
 * <p>
 * Your program should
 * check whether the input is valid. Here are sample runs:
 * Enter a SSN: 232-23-5435
 * 232-23-5435 is a valid social security number
 * Enter a SSN: 23-23-5435
 * 23-23-5435 is an invalid social security number
 */
public class Answer_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();

		boolean isValid = 
			(ssn.length() == 11) && 
			(Character.isDigit(ssn.charAt(0))) &&
			(Character.isDigit(ssn.charAt(1))) &&
			(Character.isDigit(ssn.charAt(2))) &&
			(ssn.charAt(3) == '-') &&
			(Character.isDigit(ssn.charAt(4))) &&
			(Character.isDigit(ssn.charAt(5))) &&
			(Character.isDigit(ssn.charAt(7))) &&
			(ssn.charAt(6) == '-') &&
			(Character.isDigit(ssn.charAt(8))) &&
			(Character.isDigit(ssn.charAt(9))) &&
			(Character.isDigit(ssn.charAt(10)));

		// Display result
		System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")
			+ "social security number");
    }
}