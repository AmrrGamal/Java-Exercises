package ch_04;

import java.util.Scanner;


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






