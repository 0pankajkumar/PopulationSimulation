package Helper;

import java.util.*;

public class Martian
{
    int pan;
    boolean sex; //True is Male & False is Female
    int age;

    public static int count = 0;
    public static int dead = 0;

    Martian youngerSibling;
    Martian elderSibling;

    public Martian(int age)
    {
        this.elderSibling = null;
        this.youngerSibling = null;
        this.sex = maleOrFemale();
        this.pan = ++count;
        System.out.println("Creating Human with age " + age);
        this.age = age;
    }

    //Detemining sex randomly
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

}