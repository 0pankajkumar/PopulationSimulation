import Helper.Martian; //The actual code is in this package
import java.util.*; // For generating random numbers for random age

public class PopulationSimulation
{
    public static void initialGenerations()
    {
        Random rand = new Random();

        //Adding 1st generation of 3 families for free
        for (int u = 0; u < 3; u++)
        {
            Martian.maharashtra.add(rand.nextInt(10));
        }
        Martian.india.add(Martian.maharashtra);
        //Done adding first family

        //Adding 2nd generation of 10 families for free
        for (int u = 0; u < 10; u++)
        {
            Martian.maharashtra.add(rand.nextInt(10));
        }
        Martian.india.add(Martian.maharashtra);
        //Done adding second family

    }
    public static void main(String[] args)
    {
        Martian obj = new Martian();
        Random rand = new Random();

        initialGenerations();

        //loop till 2000 assuming 100 years for each generation
        for (int u = 0; u < 2000; u++)
        {

            obj.mate(); //Includes die.
        }

    }


}