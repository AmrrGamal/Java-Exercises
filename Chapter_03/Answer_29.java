package chapterThree;

import java.util.Scanner;


public class Answer_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, radiusOne, radiusTwo;
        System.out.print("\nEnter circle1's x , y , and radius: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        radiusOne = input.nextDouble();

        System.out.print("\nEnter circle2's x , y , and radius: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        radiusTwo = input.nextDouble();


        
        double distanceBetweenCenters = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        String result = "";
        if (distanceBetweenCenters <= Math.abs(radiusOne - radiusTwo)) {
            result += "is inside circle1.";

        } else if (distanceBetweenCenters <= radiusOne + radiusTwo) {
            result += " is overlaps circle1.";

        } else {
            result += " does not overlap circle1";

        }
        System.out.println("Circle2 " + result); 


    }

}
