package chapterThree;


public class Answer_04 {
    public static void main(String[] args) {

        System.out.println("enter To the random month generator!");

        int randomMonth = (int) (1 + Math.random() * 12);

        String nameOfMonth = "";

        switch (randomMonth) {

            case 1:
                nameOfMonth = "January";
                break;

            case 2:
                nameOfMonth = "Feburary";
                break;

            case 3:
                nameOfMonth = "March";
                break;

            case 4:
                nameOfMonth = "April";
                break;

            case 5:
                nameOfMonth = "May";
                break;

            case 6:
                nameOfMonth = "June";
                break;

            case 7:
                nameOfMonth = "July";
                break;

            case 8:
                nameOfMonth = "August";
                break;

            case 9:
                nameOfMonth = "September";
                break;

            case 10:
                nameOfMonth = "October";
                break;

            case 11:
                nameOfMonth = "November";
                break;

            case 12:
                nameOfMonth = "December";
                break;
        }

        System.out.println("The program generated: " + randomMonth + " for " + nameOfMonth);


    }

}
