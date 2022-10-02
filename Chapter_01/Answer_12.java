package ch_01;


public class Answer_12 {
    public static void main(String[] args) {
        double hour = 1;
        double minutes = 40;
        double seconds = 35;
        double totaldistInMiles = 24;
        double kilodist = totaldistInMiles * 1.6;
        double converttomin = hour * 60 + minutes + seconds / 60;
        double AvgKiloPerHour = 60 * kilodist / converttomin;

        System.out.println(AvgKiloPerHour);

    }

}
