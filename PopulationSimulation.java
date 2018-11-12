//First java program
import java.util.Random;

public class PopulationSimulation
{
    public long count = 0;

    //Basic Structure of a human
    public static class Human
    {
        long pan;
        boolean sex; //True is Male
        Human father;
        Human mother;
        Human nextSibling;
        Human spouse;
        Human()
        {
            this.father = null;
            this.mother = null;
            this.nextSibling = null;
            this.spouse = null;
        }
    }

    //Taking a birth
    public Human birth()
    {
        Human box = new Human();
        box.pan = count + 1;
        box.sex = maleOrFemale();
        return box;
    }

    //Detemining sex
    public boolean maleOrFemale ()
    {
        Random rand = new Random();
        int randNumber = rand.nextInt(1000);
        if(randNumber % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void main(String[] args)
    {

    }
}