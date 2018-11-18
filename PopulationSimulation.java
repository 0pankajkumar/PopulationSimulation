import Helper.Human;
import java.util.Random;

public class PopulationSimulation
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Human first = new Human(rand.nextInt(80));
        Human second = new Human(rand.nextInt(80));

        first.start();
        second.start();


    }
}