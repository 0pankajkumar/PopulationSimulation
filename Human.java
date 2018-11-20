package Helper;

import java.util.Random;
import java.util.*;

//Basic Structure of a human
public class Human extends Thread
{
    Node head;
    public static long count = 0;
    public static long dead = 0;
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
        System.out.println("Creating Human with age " + age);
        this.age = age;
    }

    public static LinkedList<Human> marriageList = new LinkedList<Human>();
    public void run()
    {

        // Displaying the thread that is running
        if(sex) //If Male
        {
            System.out.println ("Man " + Thread.currentThread().getId() + " is alive");

            //Sleep till 2
            //Only if human has that much to live. Otherwise die.
            if(this.age > 2)
            {
                try{Thread.sleep(2);} catch(InterruptedException e) {System.out.println("Thread sleep error");}
                //Eligible for marriage after 2
    		    marriageList.add(this); //This Human is added in marriage queue


                {

                    System.out.println(marriageList.size());
                }

    		    //Find a suitable match & marrying
                this.match();

                //Mating between spouses happenning
    		    this.mate();

    		    //Sleep for rest of time
    		    try{Thread.sleep(this.age - 2);} catch(InterruptedException e) {System.out.println("Thread sleep error");}

            }
            else
            {
                try{Thread.sleep(this.age);} catch(InterruptedException e) {System.out.println("Thread sleep error");}

            }

            dead++;
            System.out.println("Man " + Thread.currentThread().getId() + " is dead. RIP");
        }
        else //If Female
        {
            System.out.println ("Woman " + Thread.currentThread().getId() + " is alive");

            //Sleep till 2
            //Only if human has that much to live. Otherwise die.
            if(this.age > 2)
            {
                try{Thread.sleep(2);} catch(InterruptedException e) {System.out.println("Thread sleep error");}
                //Eligible for marriage after 2
    		    marriageList.add(this); //This Human is added in marriage queue

                System.out.println(marriageList.size());


    		    //Find a suitable match & marrying
                this.match();

                //Mating between spouses happenning
    		    this.mate();

    		    //Sleep for rest of time
    		    try{Thread.sleep(this.age - 2);} catch(InterruptedException e) {System.out.println("Thread sleep error");}

            }
            else
            {
                try{Thread.sleep(this.age);} catch(InterruptedException e) {System.out.println("Thread sleep error");}

            }

            dead++;
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
                System.out.println("Match found for " + Thread.currentThread().getId());
                this.spouse = temp;
                temp.spouse = this.spouse;
                break;
            }
        }
    }

    //Mating
    public void mate()
    {
        if(this.spouse != null) //Checking whether spouse is present
        {
            Random rand = new Random();
            int randNumber = rand.nextInt(10); //Randomly deciding number of children they will have

            Human fath = null;
            Human moth = null;
            //Assigning father & mother to the child born
            if(this.sex == true)
            {
                fath = this;
                moth = this.spouse;
            }
            if(this.sex == false)
            {
                moth = this;
                fath = this.spouse;
            }

            Human elderSibling = new Human(rand.nextInt(8));
            //Children taking birth
            for(int j = 0; j < randNumber - 1; j++)
            {
                Human child = new Human(rand.nextInt(8));
                child.father = fath;
                child.mother = moth;
                elderSibling.nextSibling = child;
                //Now child knows who is his/her father, mother & sibling

                //starting the child thread
                child.start();

                elderSibling = child;
            }
        }
    }
}