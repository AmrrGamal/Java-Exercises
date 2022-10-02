package ch_04;

import java.util.*;

/**
 * 4.5 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
 * which all sides are of the same length and all angles have the same degree (i.e., the
 * polygon is both equilateral and equiangular). The formula for computing the area
 * of a regular polygon is
 * Area =(n * s2) /(4 * tan¢ pn)
 * 
 * Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area. Here is
 * a sample run:
 * Enter the number of sides: 5
 * Enter the side: 6.5
 * The area of the polygon is 74.69017017488385
 */
public class Answer_05 {
    //computes the area of a regular polygon
    public static void main(String[] args) {

        System.out.println("Enter the number of sides : ");

        Scanner input = new Scanner(System.in);

        int numberOfSlides = input.nextInt();

        System.out.println("Enter  the sides: ");

        double lengthSides = input.nextDouble();

        double area = (numberOfSlides * lengthSides * lengthSides) / (4 * Math.tan(Math.PI / numberOfSlides));

        System.out.println("The area of your polygon is: " + area);


    }
}
