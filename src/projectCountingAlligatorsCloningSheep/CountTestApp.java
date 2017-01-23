package projectCountingAlligatorsCloningSheep;

/**
 * Created by vanessamnoble on 1/20/17.
 */

public class CountTestApp extends CountUtil {

    public static void main(String args[]) throws CloneNotSupportedException
    {
        // Count alligators
        System.out.println("Counting Alligators…"+"\n");

        Countable a = new Alligator();  //CountUtil x = CountUtil();
        count(a,3);                     //counts the Alligator 3 times,


        System.out.println();           //Count sheep
        System.out.println("Counting Sheep…"+"\n");


        Sheep s1 =  new Sheep();
        s1.resetCount();            // reset count to zero
        s1.setSheepName("BLACKIE"); // set Blackie
        count(s1,2);                //counts the first Blackie 2 times,

        System.out.println("");

        // clone sheep object "Dolly"
        Sheep s2 = (Sheep) s1.clone();  // clone Blackie to Dolly
        s2.resetCount();                // reset count to zero fROM count (S1,2)
        s2.setSheepName("DOLLY");      // Name Dolly
        count(s2,3);                  // counts the first sheep 3 times,

        System.out.println("");

        s1.resetCount();             // reset count to zero fROM count (S1,2)
        s1.setSheepName("Blackie"); // Set sheep Name
        count(s1,1);                //counts the first sheep again 1 time.

        System.out.println();

    }

}