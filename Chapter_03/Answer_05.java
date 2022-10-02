package chapterThree;

import java.util.Scanner;


public class Answer_05 {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println("Enter today's day : ");


        int weekDay = n.nextInt();

       
            System.out.print("Enter the number of days elapsed since today : ");
            int numDays = n.nextInt();

            int futureWeekDay = (weekDay + numDays) % 7;

            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            System.out.println(daysOfWeek[futureWeekDay]);
            n.close();


        }


    }


