package ch_02;

import java.util.*;


public class Answer_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of three points seprated by spaces for a triangle: ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double s1 = side(x1, y1, x2, y2);
        double s2 = side(x2, y2, x3, y3);
        double s3 = side(x1, y1, x3, y3);

        double s = (s1 + s2 + s3) / 2;

        double area = Math.sqrt((s * (s - s1) * (s - s2) * (s - s3)));

        System.out.println(" area of the triangle is: " + area);
    }

    public static double side(double x0, double y0, double x1, double y1) {
        return Math.pow(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2), 0.5);
    }


}
