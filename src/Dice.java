
/**
 * Created by vanessamnoble on 1/9/17.
 */
//Let's create an object-oriented dice-roller app! Following the general directions of the Methods exercise with the Dice roller,
//        - Create a class called Die or Dice.java
//        - Create your main class (the class with the main() method) and name id DiceRollingApp.java
//        - Put all your user input on the DiceRollingApp
//        - Your Die class should have the numberOfSides property and the roll() method defined on it

import java.util.Random;


public class Dice {
    //cmd n*
    private final Random rand;
    private final int faces;

    public static int getNumberOfDiceCreated() {
        return numberOfDiceCreated;
    }

    private static int numberOfDiceCreated;

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    private int currentValue;



    public Dice(int faces) {
        this.rand = new Random();
        this.faces = faces;
        this.currentValue = roll();
        numberOfDiceCreated++;
    }

    public int roll() {

        return 1 + rand.nextInt(faces);

    }
}
