package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FilterDuplicatesUsingHashMap {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,2,4,5,6,5,7));
		
		Map<Integer,Integer> hashmap=new HashMap();
		Set<Integer> duplicates=new HashSet();
		Set<Integer> nonDuplicates=new HashSet();
		for(int n:numbers)                       			//n
			hashmap.put(n, hashmap.getOrDefault(n, 0)+1);	//4
			
		for(int n:numbers)  
		{
			if(hashmap.get(n)>1)
				duplicates.add(n);
			else
				nonDuplicates.add(n);
			
		}
		
		System.out.println("Duplicates " +duplicates);
		System.out.println("Non Duplicates " +nonDuplicates);

	}

}


/*

{
1=1
2=2
3=1
4=1
5=2
6=1
7=1
}

*/