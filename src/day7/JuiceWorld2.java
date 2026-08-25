package day7;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JuiceWorld2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of Mango juices");
		int mango=sc.nextInt();
		System.out.println("Please enter number of orange juices");
		int orange=sc.nextInt();
		System.out.println("Please enter number of Pine apple juices");
		int pineapple=sc.nextInt();
		
		int minTime=calculateMinimumTime(mango,orange,pineapple);
		System.out.println("Maximum time to prepare order "+ minTime);
	}

	private static int calculateMinimumTime(int mango, int orange, int pineapple) {
		PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>();
		Iterator<Integer> itr=pqueue.iterator();
		pqueue.add(mango);
		pqueue.add(orange);
		pqueue.add(pineapple);
		
		int seconds=0;
		int j1,j2;
		
		while(!pqueue.isEmpty())
		{
			j1=0;
			j2=0;
			
			if(itr.hasNext())
			j1=pqueue.remove();
			
			if(itr.hasNext())
			j2=pqueue.remove();
			
			if(j1>0 && j2==0)
			{
				seconds+=j1;
				break;
			}
			
			
			if(j1>0 && j2>0)
			{
				j1--;
				j2--;
				seconds++;
			}
			
			if(j1>0)
				pqueue.add(j1);
			
			if(j2>0)
				pqueue.add(j2);
			}
		
		return seconds;
		}
	
}
