package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterDuplicates {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,2,4,5,6,5,7));
		
		Set<Integer> hashset=new HashSet(); //[1,2,3]
		Set<Integer> duplicates=new HashSet();
		for(int n:numbers)    //n
		{                     //1
			if(!hashset.add(n))
			{
				duplicates.add(n);
			}
			
		}
		
		System.out.println(duplicates);
	}

}
