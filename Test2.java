import java.util.*;

public class Test2
{
    public static void main(String[] args)
    {
        int a = 0;
        //declaring ArrayList with initial size n
        ArrayList<ArrayList> india = new ArrayList<ArrayList>(5);

        for (int j = 0; j < 5; j++)
        {
            ArrayList<Integer> maharashtra = new ArrayList<Integer>(5);
            for (int i = 0; i < 5; i++)
            {
                maharashtra.add(a);
                a++;
            }
            india.add(maharashtra);
        }

        System.out.println(india);
        System.out.println(india.get(1).get(0));
    }
}