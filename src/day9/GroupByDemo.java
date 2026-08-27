package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

	public static void main(String[] args) {
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		
		Map<Integer,List<String>> hashmap=new HashMap();
		
//		hashmap=months.stream()
//		.collect(Collectors.groupingBy(String::length));
		
		hashmap=months.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.toList())));
		
		System.out.println(hashmap);
		
		Map<Integer,Long> hashmap1=new HashMap();
		
		hashmap1=months.stream()
		.collect(Collectors.groupingBy(String::length,Collectors.counting()));
		
		System.out.println(hashmap1);
		
		Map<Integer,String> hashmap2=new HashMap();
		
		hashmap2=months.stream()
		.collect(Collectors.groupingBy(String::length,Collectors.joining("-","#","$")));
		
		System.out.println(hashmap2);

	}

}


//{3="May", 4="June-July", 5=[March, April], 6=[August], 7=[January, October], 8=[February, November, December], 9=[September]}
