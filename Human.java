package Helper;

import java.util.Random;

//Basic Structure of a human
public class Human extends Thread
{
    public static long count = 0;
    long pan;
    boolean sex; //True is Male & False is Female
    int age;
    Human father;
    Human mother;
    Human nextSibling;
    Human spouse;
    public Human(int age)
    {
        this.father = null;
        this.mother = null;
        this.nextSibling = null;
        this.spouse = null;
        this.sex = maleOrFemale();
        this.pan = ++count;
        System.out.println("Creating Thread");
        this.age = age;
    }
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                  Thread.currentThread().getId() +
                  " is running");
            if(Thread.currentThread().getId() % 2 == 0)
            {
                Thread.sleep(10000);
            }

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " exiting.");
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

    //Marriage
    public void marriage()
    {

    }

    //Mating
    public void mate()
    {

    }

    //live
    public void live()
    {

    }
}