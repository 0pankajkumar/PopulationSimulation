import java.util.*;

public class Test2
{
    public static void main(String[] args)
    {
        int a = 0;
        //declaring ArrayList with initial size n
        ArrayList<ArrayList> india = new ArrayList<ArrayList>();

        System.out.println(india);

        for (int j = 0; j < 5; j++)
        {
            ArrayList<Integer> maharashtra = new ArrayList<Integer>();
            for (int i = 0; i < 5; i++)
            {
                maharashtra.add(a);
                a++;
                maharashtra.remove(i);
            }
            maharashtra.remove(2);
            india.add(maharashtra);
        }

        System.out.println(india);
        System.out.println(india.get(1).get(0));
    }
}