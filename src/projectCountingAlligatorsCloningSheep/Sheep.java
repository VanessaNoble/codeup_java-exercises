package projectCountingAlligatorsCloningSheep;

/**
 * Created by vanessamnoble on 1/20/17.
 */

public class Sheep implements Countable ,Cloneable {

    private int countSheep = 0;
    private String sheepName;

    public void setSheepName(String sheep)
    {
        sheepName = sheep;
    }
    public String getsheeNames()
    {
        return sheepName;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {

        return super.clone();

    }

    @Override
    public void incrementCount() {
        countSheep=countSheep+1;

    }

    @Override
    public void resetCount()
    {
        countSheep=0;
    }

    @Override
    public int getCount() {
        return countSheep;
    }

    @Override
    public String getCountString() {

        return getCount() + " " + getsheeNames();

    }

}