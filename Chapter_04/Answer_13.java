package ch_04;

import java.util.*;

/**
 * *4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter
 * check whether the letter is a vowel or consonant.
 * <p>
 * Here is a sample run:
 * Enter a letter: B
 * B is a consonant
 * Enter a letter grade: a
 * a is a vowel
 * Enter a letter grade: #
 * # is an invalid input
 */
public class Answer_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter: ");
   
        
       char ch = in.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
    }
    }
}
    