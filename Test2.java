import java.util.*;

public class Test2
{
    public static void main(String[] args)
    {
        int a = 0;
        //declaring ArrayList with initial size n
        ArrayList<ArrayList> arrli = new ArrayList<ArrayList>(5);

        for (int j = 0; j < 5; j++)
        {
            ArrayList<Integer> arrlili = new ArrayList<Integer>(5);
            for (int i = 0; i < 5; i++)
            {
                arrlili.add(a);
                a++;
            }
            arrli.add(arrlili);
        }

        System.out.println(arrli);
    }
}