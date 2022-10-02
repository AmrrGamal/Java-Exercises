package ch_02;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Answer_02 {
    public static void main(String[] args) {
        System.out.print("Enter the  length of a tringle: ");
        Scanner input = new Scanner(System.in);

        double length = input.nextDouble();

        double area = length * length  *sqrt(3)/4 ;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

        input.close();

    }

}
