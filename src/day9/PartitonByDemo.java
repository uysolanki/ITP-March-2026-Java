package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitonByDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5,6,7));
		
		Map<Boolean,List<Integer>> hashmap=new HashMap();
		
		hashmap=numbers.stream()
		.collect(Collectors.partitioningBy(num->num>3));
		
		System.out.println(hashmap);
		
		
		Map<Boolean,Long> hashmap1=new HashMap();
		
		hashmap1=numbers.stream()
		.collect(Collectors.partitioningBy(num->num>3,Collectors.counting()));
		
		System.out.println(hashmap1);
	}

}
