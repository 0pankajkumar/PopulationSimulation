package Helper;

import java.util.Random;
import java.util.*;

//Basic Structure of a human
public class Human extends Thread
{
    Node head;
    public static long count = 0;
    long pan;
    boolean sex; //True is Male & False is Female
    int age;
    Human father;
    Human mother;
    Human nextSibling;
    Human spouse;

    static class Node {
		Human box;
		Node next;
		Node(Human d) { box = d; next=null; } // Constructor
	}

    public Human(int age)
    {
        this.father = null;
        this.mother = null;
        this.nextSibling = null;
        this.spouse = null;
        this.sex = maleOrFemale();
        this.pan = ++count;
        System.out.println("Creating Human");
        this.age = age;
    }

    LinkedList<Human> marriageList = new LinkedList<Human>();
    public void run()
    {

        // Displaying the thread that is running
        if(sex) //If Male
        {
            System.out.println ("Man " + pan + " is alive at Thread " + Thread.currentThread().getId());

            //Sleep till 18
            //Only if human has that much to live. Otherwise die.
            if(this.age > 18)
            {
                try{Thread.sleep(18);} catch(InterruptedException e) {System.out.println("Thread sleep error");}
            }
            else
            {
                try{Thread.sleep(this.age);} catch(InterruptedException e) {System.out.println("Thread sleep error");}
            }

            //Eligible for marriage after 18
		    marriageList.add(this); //This Human is added in marriage queue

		    //Find a suitable match & marrying
            this.match();

		    //mate()

            System.out.println("Man " + Thread.currentThread().getId() + " is dead. RIP");
        }
        else //If Female
        {
            System.out.println ("Woman " + pan + " is alive at Thread " + Thread.currentThread().getId());
            try{Thread.sleep(this.age);} catch(InterruptedException e) {System.out.println("Thread sleep error");}
            System.out.println("Woman " + Thread.currentThread().getId() + " is dead. RIP");
        }


    }


    //Detemining sex randomly
    public boolean maleOrFemale ()
    {
        Random rand = new Random();
        int randNumber = rand.nextInt(1000);
        if(randNumber % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Finding a Match & Marriage
    public void match()
    {
        boolean interestedIn; //Making humans mate with opposite sex only
        interestedIn = (this.sex)?false:true;

        Iterator<Human> itr=marriageList.iterator();
        while(itr.hasNext())
        {
            Human temp = itr.next();
            if(temp.sex == interestedIn) //If match is of opposite sex
            {
                //Marrying the match
                this.spouse = temp;
                temp.spouse = this.spouse;
                break;
            }
        }
    }

    //Mating
    public void mate()
    {

    }
}