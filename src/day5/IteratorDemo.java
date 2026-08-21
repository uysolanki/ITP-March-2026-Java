package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
public static void main(String[] args) {
	
	//Delete all odd numbers
	List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));  //modCount
	Iterator<Integer> itr=numbers.iterator();
	
	while(itr.hasNext())
	{
		if(itr.next()%2==1)
			itr.remove();
	}
	
	System.out.println(numbers);
	
	//ConcurrentModificationException
}
}
