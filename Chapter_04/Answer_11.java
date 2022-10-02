package ch_04;

import java.util.Scanner;

/**
 * *4.11 (Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number. Here are some sample runs:
 * Enter a decimal value (0 to 15): 11
 * The hex value is B
 * Enter a decimal value (0 to 15): 5
 * The hex value is 5
 * Enter a decimal value (0 to 15): 31
 * 31 is an invalid input
 */
public class Answer_11 {
 

  public static void main(String[] args) {

   
    
    System.out.println("enter binary digits :");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    // call method to convert to binary
    long binary = binaryToDecimal(num);
    System.out.println("the binary digits is : "+ binary);

    }

  static int binaryToDecimal(int n)
    {
        int num = n;
        int dec_value = 0;
 
        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;
 
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
 
        return dec_value;
    }
}






