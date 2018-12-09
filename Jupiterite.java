//Pseudo code only


import java.util.*;

public class Jupiterite
{
    public static ArrayList<ArrayList<Integer>> generations = new ArrayList<ArrayList<Integer>>(); //List of a generations


    //Mate & die
    public static void wave()
    {
        ArrayList<Integer> zeroGen = generations.get(0);
        ArrayList<Integer> firstGen = generations.get(1);
        ArrayList<Integer> secondGen = generations.get(2);
        Random rand = new Random();
        int noOfFamiles = firstGen.size();
        int localNoOfFamiles = noOfFamiles;

            while(noOfFamiles >= 2) //Ensures that almost all familes of generation participate in mating season
            {
                int selection = rand.nextInt(localNoOfFamiles);

                System.out.println("Inside Loop 1");
                //This will not allow 0 family size to enter competition
                while(firstGen.get(selection) == 0)
                {
                    System.out.println("Inside Loop 2");
                    firstGen.remove(selection);
                    selection = rand.nextInt(firstGen.size());
                }


                int selection2 = rand.nextInt(firstGen.size());

                while(selection2 == 0 || selection2 == selection || selection2 == selection+1 || selection2 == selection-1)
                {
                    System.out.println("Inside Loop 3");
                    selection2 = rand.nextInt(firstGen.size());
                }

                if((rand.nextInt() % 2) == 1) //Just making it look random. Combined sex determination & male-female matching condition for marriage
                {
                    //Adding children to the couple in next generation
                    secondGen.add(rand.nextInt(10));
                }
            }

        System.out.println("Outside all Loops");

        zeroGen = firstGen;
        firstGen = secondGen;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        secondGen = temp;
    }

    public static void main(String[] args)
    {
        Random rand = new Random();

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++)
        {
            temp.add(rand.nextInt(10));
        }
        generations.add(temp);

        temp.clear();
        for(int i = 0; i < 30; i++)
        {
            temp.add(rand.nextInt(10));
        }
        generations.add(temp);

        temp.clear();
        for(int i = 0; i < 30; i++)
        {
            temp.add(rand.nextInt(10));
        }
        generations.add(temp);



        wave(); //Run thousand times
    }
}
