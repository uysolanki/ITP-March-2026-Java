package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	
	//Delete all odd numbers
	List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));  //modCount=5
	List<Integer> oddNumbers=new ArrayList();
	//start check modCount=5
	for(int n:numbers)
	{
		if(n%2==1)
			oddNumbers.add(n);
	}
	//end check modCount=5
	numbers.removeAll(oddNumbers);
	System.out.println(numbers);  //[2,4]
	
	//ConcurrentModificationException
}
}
