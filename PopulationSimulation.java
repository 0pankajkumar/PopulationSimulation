//First java program
import java.util.Random;

public class PopulationSimulation
{
    public static long count = 0;

    //Basic Structure of a human
    public static class Human extends Thread
    {
        long pan;
        boolean sex; //True is Male & False is Female
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
        public void run()
        {
            try
            {
                // Displaying the thread that is running
                System.out.println ("Thread " +
                      Thread.currentThread().getId() +
                      " is running");
                try{Thread.sleep(100);}catch(InterruptedException e){System.out.println(e);}

            }
            catch (Exception e)
            {
                // Throwing an exception
                System.out.println ("Exception is caught");
            }
        }
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

    //Marriage
    public static void marriage()
    {

    }

    //Mating
    public static void mate()
    {

    }

    //live
    public static void live()
    {

    }

    public static void main(String[] args)
    {
        Human first = new Human();
        Human second = new Human();
        Human third = new Human();
        first.run();
        try
        {
            first.wait();
        }
        catch (Exception e)
        {
            System.out.println("Exception is caught while waiting");
        }
        second.run();
        third.run();



        for (int i = 0; i < 10; i++)
        {
            ;
        }
    }
}