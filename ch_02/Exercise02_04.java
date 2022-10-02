package ch_02;

import java.util.Scanner;

/**
 * 2.4 (Convert square into ping) Write a program that converts square into ping.
 * The program prompts the user to enter a number in square, converts it
 * to ping, and displays the result. One square is 0.3025 ping. 
 */
public class Exercise02_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of square : ");

        double square = input.nextDouble();
        double ping = square *0.3025;

        System.out.println(square + " square is equal to " + ping + " pings");

    }

}
