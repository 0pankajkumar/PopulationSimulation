//Pseudo code only
package Helper;

import java.util.*;

public class Jupiterite
{
    public static ArrayList<ArrayList> generations = new ArrayList<ArrayList>(); //List of a generations


    //Mate & die
    public void mate()
    {
        Go to second generation
            While loop : Till list of available Global families in Generation two is >= 2
                While loop : Till list of available families is >= 2
                    Maintain a local copy of available familes
                    Select any family from list of available families
                    If its count is already zero
                        Remove the family number from local list of available families
                        repeat the loop
                    Else get out of While loop

                While loop
                    Maintain a local copy of available familes
                    Select any other family but not neighbouring family or the smae family as selected from above loop
                    If they can mate
                        Add a New family in generation three
                        Decrease Global count in both families
                    Else
                        Remove the family number from local list of available families
                        Repeat the While loop
        first generation = second generation
        second generation = third generation
        third generation = Null

    >>Mate will be reperated 2000 times For 2 thousand generations
