import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by vanessamnoble on 1/16/17.
 */

public class Validator {

    private Scanner scan;

    public Validator(Scanner scan) {
        this.scan = scan;
    }
    public String getChoiceString(Scanner sc, String prompt, String option1, String option2, String message) {
        String myString;
        try {
            System.out.print(prompt);
            myString = sc.nextLine();

            if (!(myString.equalsIgnoreCase(option1) || myString.equalsIgnoreCase(option2))) {
                throw new IllegalArgumentException("ERROR - " + message);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getChoiceString(sc, prompt, option1, option2, message);
        }
        return myString;
    }
    double getDouble(String prompt) {
        double userDouble;
        System.out.print(prompt);
        try {
            userDouble = scan.nextDouble();
        } catch(InputMismatchException e) {
            scan.next();
            System.out.println("Please enter a valid decimal number");
            return getDouble(prompt);
        }
        return userDouble;
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        int userInt;

        try {
            userInt = scan.nextInt();
        } catch (InputMismatchException e) {
            scan.next();
            System.out.println("Input must be an integer");
            return getInt(prompt);
        }

        return userInt;
    }

    public int getIntWithinRange(String prompt, int min, int max) {
        int userInt = getInt(prompt);

        try {
            if (userInt < min || userInt > max) {
                throw new IllegalArgumentException("Your input must be an integer between " + min + " and " + max);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getIntWithinRange(prompt, min, max);
        }

        return userInt;
    }
}




