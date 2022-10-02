package ch_01;


public class Answer_11 {
    public static void main(String[] args) {


        double timeForNewBirth = 7.0;
        double timeForNewDeath = 13.0;
        double timeForNewImmigrant = 45.0;
        double currentPopulation = 312032486;
        
        
        //call function numOfEachInYear to know  number of each(birth ,death, immigration )in a year 
        double birthsPeryear = numOfEachInYear(timeForNewBirth);
        double deathsPeryear = numOfEachInYear(timeForNewDeath);
        double immigratePeryear = numOfEachInYear(timeForNewImmigrant);

        
        //to show the increace every year
        for  (int i = 1; i <= 5; i++) {
            currentPopulation += birthsPeryear - deathsPeryear + immigratePeryear;

            System.out.print(" population in year " + i + " will be ");
            System.out.printf("%1.0f", currentPopulation);   //To prevent displaying in scientific notation
            System.out.println();
        }

    }

    public static double numOfEachInYear(double valueInseconds) {

        double secondsInyear = 60 * 60 * 24 * 365;

        double amountPeryear = secondsInyear / valueInseconds;

        return amountPeryear;
    }

}
