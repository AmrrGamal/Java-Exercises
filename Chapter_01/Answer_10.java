package ch_01;


public class Answer_10 {

    public static void main(String[] args) {

        double numMiles = 15 / 1.6;            //Convert kilometers into MPH
        double speed = numMiles / (50 / 60);            //Average speed in miles per hour

        System.out.printf("%.3f", speed);

    }
}
