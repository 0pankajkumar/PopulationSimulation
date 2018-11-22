import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import Helper.Human;

public class Test
{
    public static void main(String[] args)
    {
        ExecutorService service = Executors.newFixedThreadPool(10);

        Human first = new Human(2);
        service.execute(first);

        int core = Runtime.getRuntime().availableProcessors();
        System.out.println("Core are" + core);

        service.shutdown();
        while (!service.isTerminated()) {
        }
        System.out.println("Finished all threads");




    }
}