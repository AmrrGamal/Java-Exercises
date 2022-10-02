package ch_04;

/**
 * 4.3 (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
 * www.gps-data-team.com/map/ and compute the estimated area enclosed by these
 * four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
 * distance between two cities. Divide the polygon into two triangles and use the
 * formula in Programming Exercise 2.19 to compute the area of a triangle.)
 * -84.2782200,33.8901000 Atlanta
 * -81.5197542,28.4283959 Orlando
 * -81.1746100,32.1081500 Savannah
 * -80.9567600,35.2072400 Charlotte
 * Formula for distance -->>> d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * <p>
 * <p>
 * s = (side1 + side2 + side3)/2;
 * area = SQRT((s - side1)(s - side2)(s - side3))
 *
 * @author Harry D.
 */
public class Answer_03 {

      public static void main(String[] args) {
        final double d1, d2, d3, d4, d5, A1, A2;
        final double HalfSumLengthSide1, HalfSumLengthSide2;
        final double x1, y1, x2, y2, x3, y3, x4, y4;
        final double x1Radian,y1Radian,x2Radian,y2Radian;
        final double x3Radian,y3Radian,x4Radian,y4Radian;
        final double EARTH_AVERAGE_RADIUS = 6371.01;

        x1 = 35.2270869;
        y1 = -80.8431267;
        x1Radian = Math.toRadians(x1);
        y1Radian = Math.toRadians(y1);

        x2 = 33.7489954;
        y2 = -84.3879824;
        x2Radian = Math.toRadians(x2);
        y2Radian = Math.toRadians(y2);

        x3 = 32.0835407;
        y3 = -81.0998342;
        x3Radian = Math.toRadians(x3);
        y3Radian = Math.toRadians(y3);

        x4 = 28.5383355;
        y4 = -81.3792365;
        x4Radian = Math.toRadians(x4);
        y4Radian = Math.toRadians(y4);

        d1 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1Radian) * Math.sin(x2Radian)
                + Math.cos(x1Radian) * Math.cos(x2Radian) * Math.cos(y1Radian - y2Radian));

        d2 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1Radian) * Math.sin(x3Radian)
                + Math.cos(x1Radian) * Math.cos(x3Radian) * Math.cos(y1Radian - y3Radian));

        d3 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x4Radian) * Math.sin(x2Radian)
                + Math.cos(x4Radian) * Math.cos(x2Radian) * Math.cos(y4Radian - y2Radian));

        d4 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x3Radian) * Math.sin(x4Radian)
                + Math.cos(x3Radian) * Math.cos(x4Radian) * Math.cos(y3Radian - y4Radian));

        d5 = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x3Radian) * Math.sin(x2Radian)
                + Math.cos(x3Radian) * Math.cos(x2Radian) * Math.cos(y3Radian - y2Radian));

        HalfSumLengthSide1 = (d1 + d2 + d5) / 2;
        HalfSumLengthSide2 = (d3 + d4 + d5) / 2;

        A1 = Math.pow(HalfSumLengthSide1 * (HalfSumLengthSide1 - d1)
                * (HalfSumLengthSide1 - d2) * (HalfSumLengthSide1 - d5), 0.5);

        A2 = Math.pow(HalfSumLengthSide2 * (HalfSumLengthSide2 - d3)
                * (HalfSumLengthSide2 - d4) * (HalfSumLengthSide2 - d5), 0.5);

        System.out.println("The estimated area enclosed by these four cities is " + (A1 + A2));
    }
}