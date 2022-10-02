package ch_02;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 * 2.16 (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area.
 */
public class Exercise02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the side : ");
        double side = input.nextDouble();

        double operand = (3 * sqrt(3)) / 2;
        double area = operand * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + area);

    }
}
