package Helper;

import java.util.*;

public class Martian
{
    public void generation()
    {
        ArrayList<boolean[]> arrli = new ArrayList<boolean[]>(); //List of a generation

        for loop till 2000 assuming 100 years for each generation
        {

            generation = mate(gen1); //Includes die. Return a ArrayList of newly created generation
                                        //Gen1 is passed, Gen2 will be returned
            genLi.add(generation); //New generation is added to List of generations












            int offsprings = getOffsprings(); //Calculate No. of offsprings of first mating
            //Array of all siblings. True is male & False female
            for loop till a
        }
    }

    //Mate & die
    public void mate()
    {
        //Mate
        //null or kill those two individuals
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