package chapterThree;

import java.util.*;


public class Answer_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your weight of packages: ");
        String ship = "";

        double weight = in.nextDouble();

        if (weight >20) {
            System.out.println("The package cannot be shipped.");
            in.close();
            return;
        } else if (weight > 0 && weight <= 2) {
            ship += 2.5;

        } else if (weight > 2 && weight <= 4) {
            ship += 4.5;

        } else if (weight > 4 && weight <= 10) {
            ship += 7.5;

        } else if (weight > 10 && weight <= 20) {
            ship += 10.5;

        }
        System.out.println("a package weight of " + weight + " your cost of shipping will be " + ship);
        in.close();
    }
}
