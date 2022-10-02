package chapterThree;

import java.util.*;


public class Answer_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter a point with two coordinates: ");

        double x2 = in.nextInt();
        double y2 = in.nextInt();

        double x1 = 1;
        double y1 = 1;
        
        String result = "";
        if (x2 <= 10.0 / 2 && y2 <= 5.0 / 2) {
            result += "is in the rectangle";
        } else {
            result += "is not in the rectangle";
        }

        System.out.println("Point (" + x2 + ", " + y2 + ") " + result );

        in.close();

    }
}