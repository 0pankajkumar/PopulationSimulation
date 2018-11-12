//First java program
import java.util.Random;

public class PopulationSimulation
{
    public static long count = 0;

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
            this.sex = maleOrFemale();
            this.pan = ++count;
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
    public static boolean maleOrFemale ()
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
        Human first = new Human();
        Human second = new Human();
        Human third = new Human();
        System.out.println("first is " + first.sex);
        System.out.println("with pan " + first.pan);
        System.out.println();

        System.out.println("second is " + second.sex);
        System.out.println("with pan " + second.pan);
        System.out.println();

        System.out.println("third is " + third.sex);
        System.out.println("with pan " + third.pan);
        System.out.println();

    }
}