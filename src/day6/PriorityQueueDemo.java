package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue=new PriorityQueue(Collections.reverseOrder());
//		pqueue.addAll(Arrays.asList(8,2,3,9,6));
		pqueue.addAll(Arrays.asList(8));
		System.out.println(pqueue);
		int n1=pqueue.poll();
		int n2=pqueue.poll();
		System.out.println(n1+n2);

	}

}
