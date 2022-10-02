package ch_04;

import java.util.Scanner;

/**
 * *4.18 (Student major and status) Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following chracters are used to denote the majors:
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 * Here is a sample run:
 * Enter two characters: M1
 * Mathematics Freshman
 * Enter two characters: C3
 * Computer Science Junior
 * Enter two characters: T3
 * Invalid input
 */
public class Answer_18 {
    public static void main(String [] args) {

        //student major and status

        System.out.println("enter two characters:");

        Scanner input = new Scanner(System.in);
        String statusCode = input.nextLine();

        char major = statusCode.charAt(0);
        char statusYear = statusCode.charAt(1);

        String s1 = "";
        String s2 = "";

        switch (major) {
            case 'M':
                s1 = "Mathematics";
                break;
            case 'C':
                s1 = "Computer Science";
                break;
            case 'I':
                s1 = "Information Technology";
                break;
            default:
                break;
        }

        switch (statusYear) {
            case '1':
                s2 = "Freshman";
                break;
            case '2':
                s2 = "Sophomore";
                break;
            case '3':
                s2 = "Junior";
                break;
            case '4':
                s2 = "Senior";
                break;
            default:
                break;
        }

        System.out.println(s1 + " " + s2);
    }
}






