import java.util.Scanner;

/**
 * Created by vanessamnoble on 1/17/17.
 */

//Prompt the user to enter a radius.
//        Display an error if the user enters invalid data.
//        When the user enters valid data, calculate the area and circumference of the circle and rounds to the nearest 2 decimal places.
//        Ask if the user wants to continue.
//        When the user quits, display a “goodbye” message that also indicates the number of circles the user built.
public class CircleCalculation {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Validator validator = new Validator(keyboard);

        double radius;
        String response;

        do {
            System.out.print("Enter radius: ");      // prompt
            radius = keyboard.nextDouble();         // read radius
            Circle circle = new Circle(radius);


            System.out.printf("Diameter is %.2f\n", (2 * radius));
            System.out.printf("Circumference is %.2f\n",
                    (2 * Math.PI * radius));
            System.out.printf("Area is %.2f\n",
                    Math.PI * Math.pow(radius, 2));
            response = validator.getChoiceString(keyboard, "Do you want to cont. (y/n)", "y", "n", "Only enter y or n! ");
        } while (response.equals("y"));

        System.out.println("addios, you entered this many circles," + Circle.getNumberOfCirclesCalculated() );
    }

}