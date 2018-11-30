package Helper;

import java.util.*;

public class Martian
{
    public static ArrayList<ArrayList> india = new ArrayList<ArrayList>(); //List of a generations


    //Mate & die
    public void mate()
    {
        /*
        -------------------------------------------------------------------------
        Mate
        -------------------------------------------------------------------------
        # Three generations will be present at a time. Gen1 is old & had already mated.
            Only a few must be left to mate in Gen1.
        # Gen2 is the one which will mate the most creating a Gen3.
            Gen3 will just get populated for time being
        # Before creation of Gen4 all references to Gen1 is removed for garbage collector
            and they are left to die.
        -------------------------------------------------------------------------
        */
        int randomFamilies[] = RandomizeArray(india.get(1).size());

        //System.out.println("@@@@@@@");


        //Loop till length of randomFamilies[]
        for (int i = 1; i < randomFamilies.length - 1; i++)
        {
            if (maleOrFemale()) //male encountered
            {
                //Ruling out nearby families in mating game
                if ((randomFamilies[i] + 1 != randomFamilies[i+1]) &&
                        (randomFamilies[i] - 1 != randomFamilies[i-1]) &&
                        (randomFamilies[i] > 0))
                {
                    //Looping till a match is found
                    while (!selectMatch(randomFamilies[i]), randomFamilies[])
                    {
                        //Keep looping till a match is found
                    }
                    //decrement family size as mate has been found
                    //System.out.println("DDDDDDDDDDDDDDDDDD");
                    int foo = (Integer)(india.get(1).get(randomFamilies[i]));
                    //System.out.println("EEEEEEEEEEEEEEEEE");
                    --foo;
                    if (foo < 0)
                    {
                        foo = 0;
                    }
                    //System.out.println("FFFFFFFFFFFFFFFFF");
                    india.get(1).set(i, foo);
                    //System.out.println("GGGGGGGGGGGGG");

                }

            }
        }





    }

    //Just makes a list of random numbers to randomize families while mating
    public static int[] RandomizeArray(int a)
    {
        int array[] = new int[a];
        for (int i = 0; i < a; i++)
        {
            array[i] = i;
        }
        Random rgen = new Random(); // Random number generator
        for (int i = 0; i < array.length; i++)
        {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
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

    //Selecting a match from other family
    public boolean selectMatch (int current, int randomFamilies[])
    {

        return true;
    }

}