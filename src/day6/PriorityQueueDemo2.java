package day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue=new PriorityQueue(Collections.reverseOrder());
//		pqueue.addAll(Arrays.asList(8,2,3,9,6));
		pqueue.addAll(Arrays.asList(8));
		int n1=0,n2=0;
		Iterator<Integer> itr=pqueue.iterator();
		if(itr.hasNext())
			n1=pqueue.remove();
		if(itr.hasNext())
			n2=pqueue.remove();
		
		System.out.println(n1+n2);
	}

}
