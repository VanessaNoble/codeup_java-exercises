/**
 * Created by vanessamnoble on 1/17/17.
 */
public class Circle {

    public double radius;


    // number of circles created
    public static int numberOfCirclesCalculated;

    public Circle(double radius) {
        this.radius = radius;

        numberOfCirclesCalculated++;
    }

    public static int getNumberOfCirclesCalculated() {
        return numberOfCirclesCalculated;
    }

}