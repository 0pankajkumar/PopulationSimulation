import Helper.Martian; //The actual code is in this package
import java.util.*; // For generating random numbers for random age

public class PopulationSimulation
{
    public static void initialGenerations()
    {
        Random rand = new Random();
        ArrayList<Integer> maharashtra0 = new ArrayList<Integer>(); //List of families belonging to a generation

        //Adding 1st generation of 3 families for free
        for (int u = 0; u < 3; u++)
        {
            maharashtra0.add(rand.nextInt(10));
        }
        Martian.india.add(maharashtra0);
        //Done adding first family

        ArrayList<Integer> maharashtra1 = new ArrayList<Integer>();
        //Adding 2nd generation of 10 families for free
        for (int u = 0; u < 10; u++)
        {
            maharashtra1.add(rand.nextInt(10));
        }
        Martian.india.add(maharashtra1);
        //Done adding second family

    }
    public static void main(String[] args)
    {
        Martian obj = new Martian();
        Random rand = new Random();

        initialGenerations();

        System.out.println(Martian.india);

        //loop till 2000 assuming 100 years for each generation
        for (int u = 0; u < 2000; u++)
        {

            obj.mate(); //Includes die.
        }

        System.out.println(Martian.india);
    }


}