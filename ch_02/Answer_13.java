package ch_02;

import java.util.Scanner;


public class Answer_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter  monthly contribution: ");
        double monthDeposit = input.nextDouble();
        double interestPerMonth = 0.0375 / 12;

        int count = 0;
        double total = 0;

        while (count != 6) {

            total = (total + monthDeposit) *( 1+ interestPerMonth ) ;

            ++count;
            
        System.out.println("after " + count+ " month the accunt value is : "+total );

        }

        

    }

}