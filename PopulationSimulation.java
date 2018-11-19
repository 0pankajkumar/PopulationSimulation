import Helper.Human;
import java.util.Random;

public class PopulationSimulation
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        for(int i = 0; i < 10; i++)
        {
            Human first = new Human(rand.nextInt(80));
            first.start();
        }

        long net = Human.count - Human.dead;
        System.out.println("\n\nNet threads: " + net + "\n");



    }
}