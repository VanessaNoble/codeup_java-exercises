import java.util.Scanner;

/**
 * Created by vanessamnoble on 1/9/17.
 */
public class DiceRollingApp {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice = "no";
        System.out.println(" Welcome Dice Rolla\n");

        do {
            rollTwoDice(scan);

            System.out.println(" do you want to roll again? ");
            userChoice = scan.next();

        } while (userChoice.equalsIgnoreCase("yes"));
        System.out.println("The number of dice created in the world" + Dice.getNumberOfDiceCreated());
        System.out.println("thanks for playing Dice Rolla");

    }
        public static void rollTwoDice(Scanner scan){

        int faces;

        System.out.println("How many faces does the dice have?");
        faces = scan.nextInt();


        Dice diceOne = new Dice(faces);
        Dice diceTwo = new Dice(faces);

        System.out.println("\nThe dice rolled a " + diceOne.getCurrentValue()+ ".");
        System.out.println("\nT dice rolled a " + diceTwo.getCurrentValue() + ".");


        System.out.println("\nYou rolled a " + diceTwo.getCurrentValue() + " and " + diceOne.getCurrentValue() + ".");
        System.out.println("\nthis is a total of " + (diceOne.getCurrentValue() + diceTwo.getCurrentValue()));
    }
}

