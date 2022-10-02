package ch_02;

/**
 * 2.12 (Physics: finding runway length) Given an airplane�s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * length =
 * v2
 * 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s2), and displays the minimum runway
 * length.
 */
public class Exercise02_12 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter speed  and acceleration : ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();


        System.out.printf("The minumim runway  length for this airplane is : %2.3f", Math.pow(speed, 2) / (2 * acceleration));
    }
}
