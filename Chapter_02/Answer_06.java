package ch_02;

import java.util.Scanner;


public class Answer_06 {
    public static void main(String[] args) {

        System.out.print("Enter an integer to multiply of its digits: ");

        Scanner input = new Scanner(System.in);

        int Number = input.nextInt();


        System.out.println(multiplyDigits(Number));


    }

    private static int multiplyDigits(int a) {

        int multiply = 1;
        while (a > 0) {

            multiply *= (a % 10);

            a /= 10;
        }


        return multiply;

    }

}
