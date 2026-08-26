package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		//display all odd numbers
		
		numbers.stream()
		.filter(n->n%2==1)
		.forEach(n->System.out.println(n));
		//1,2,3,4,5 -->  1,3,5 --> 1,3,5
		
		//display squares of all odd numbers
		numbers.stream()   //[1,2,3,4,5]
		.filter(n->n%2==1) //[1,3,5]
		.map(n->n*n)       //[1,9,25]
		.forEach(n->System.out.println(n)); //display
		
		//display squares of first odd numbers
		int squareOfFirstOddNumber =	numbers.stream()   //[1,2,3,4,5]
				.filter(n->n%2==1) //[1,3,5]
				.map(n->n*n)       //[1,9,25]
				.findFirst()
				.orElse(0);
		System.out.println(squareOfFirstOddNumber);
		
		
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		System.out.println("****");
		//display name of months having more than 5 chars
		months.stream()
		.filter(month->month.length()>5)
		.forEach(month->System.out.println(month));
		//display name of months starting with J
		months.stream()
		.filter(month->month.startsWith("J"))
		.forEach(month->System.out.println(month));
		//display count of months ending with 'r'
		long countOfMonthsEndingWithR=months.stream()
		.filter(month->month.endsWith("r"))
		.count();
		System.out.println(countOfMonthsEndingWithR);
		
		//display name of months having more than 5 chars in upper case
//		months.stream()
//		.filter(month->month.length()>5)
//		.map(month->month.toUpperCase())
//		.forEach(month->System.out.println(month));
		
		months.stream()
		.filter(month->month.length()>5)
		.map(String::toUpperCase)
		.forEach(month->System.out.println(month));

}
}
