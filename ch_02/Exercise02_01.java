package ch_02;

import java.util.Scanner;

/** 2.1
 * write a program to read mile and convert it into kilometer 
 * 1 mile = 1.6 kilo 
 */
public class Exercise02_01 {
	public static void main(String[]args) {
		double miles; 
		double kilo;
		
		System.out.println("Enter miles : ");
		Scanner input = new Scanner(System.in);
		miles = input.nextDouble();
		
		kilo = (miles *1.6);

		System.out.println(kilo);
		
		input.close();
	}
}
