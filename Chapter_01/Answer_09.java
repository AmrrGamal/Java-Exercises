package ch_01;


public class Answer_09 {
    public static void main(String[] args) {

        double area = 5.3 * 8.6;
        area = Math.round(area * 100);
        area /= 100;

        System.out.println("The area of a rectangle with a width of 5.3 and a height"
                + " of 8.6  is " + area);
        
        System.out.println("the Perimeter is " + (2 * (5.3 + 8.6 )));
    }
}
