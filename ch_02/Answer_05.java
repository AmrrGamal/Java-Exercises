package ch_02;

import java.util.Scanner;


public class Answer_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your subtotal and the gratuity rate: ");

        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity =  gratuityRate/subTotal;

        double total = subTotal + gratuity;

        System.out.print("The gratuity is: $");
        System.out.printf("%.1f", gratuity);
        System.out.print(" the total include gratuityRate is: $" + total);


    }

}
