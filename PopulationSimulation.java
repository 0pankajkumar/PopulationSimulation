import Helper.Human; //The actual code is in this package
import java.util.Random; // For generating random numbers for random age
import java.util.concurrent.ExecutorService; //For harnessing thread pool facility
import java.util.concurrent.Executors;

public class PopulationSimulation
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        ExecutorService service = Executors.newFixedThreadPool(8);

        for(int i = 0; i < 8; i++)
        {
            Human first = new Human(rand.nextInt(8));
            service.execute(first);
            //first.start();
        }

        service.shutdown();
        while (!service.isTerminated()) {
        }
        System.out.println("Finished all threads");

        long net = Human.count - Human.dead;
        System.out.println("\n\nNet threads: " + net + "\n");



    }
}