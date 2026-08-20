package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterUniqueElements {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,2,4,5,6,5,7));
		
		Set<Integer> hashset=new HashSet(numbers);
		System.out.println(hashset);
		
		
	}

}
