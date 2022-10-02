package ch_02;

import java.util.Scanner;

/**
 * 2.3 (Convert meters into feet ) Write a program that reads a number in meters, converts it
 * to feet, and displays the result. One meters is 3.2786 feet.
 */
public class Exercise02_03 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value of meters : ");

        double meters = input.nextDouble();
        double feet = meters *3.2786;


        System.out.println(meters + " meters is equal to " + feet + " feets");
    }
}
