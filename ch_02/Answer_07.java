package ch_02;


import java.util.Scanner;


public class Answer_07 {
    public static void main(String[] args) {

         int minutesInHour = 60;
         int hoursInDay = 24;
         int daysInYear = 365;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");

        int numOfMinutes = input.nextInt();

        int numOfyears = numOfMinutes / minutesInHour / hoursInDay / daysInYear;

        int numOfdays = numOfMinutes / minutesInHour / hoursInDay % daysInYear;

        System.out.println(numOfMinutes + " minutes is  " + numOfyears + " years and " + numOfdays + " days");

    }

}
