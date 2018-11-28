package Helper;

import java.util.*;

public class Martian
{
    public static ArrayList<ArrayList> generationList = new ArrayList<ArrayList>(); //List of a generations

    public static ArrayList<boolean[]> familyList = new ArrayList<boolean[]>(); //List of families belonging to a generation

    public void generation()
    {
        for (int u = 0; u < 2000; u++) //loop till 2000 assuming 100 years for each generation
        {

            mate(); //Includes die.



        }
    }

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
        int randomFamilies[] = RandomizeArray(familyList.size());
        for (int i = 0; i < generationList.get(1).size(); i++)
        {
            generationList.get(i);
        }

        //null or kill those two individuals


        //generationList.add(); //New generation is added to List of generations

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


}