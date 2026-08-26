package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferencingDemo2 {

	public static void main(String[] args) {
		
		
		List<Integer> numbers=new ArrayList(Arrays.asList(7,13,28,43,12));
		//display name of months having more than 5 chars
//		numbers.stream()
//		.filter(n->{
//			int counter=0;
//			for(int i=1;i<=n;i++)
//			{
//				if(n%i==0)
//					counter++;
//			}
//			
//			if(counter==2)
//				return true;
//			else
//				return false;
//		})
//		.forEach(n->System.out.println(n));
		
		
		numbers.stream()
		.filter(MethodReferencingDemo2::checkPrime)
		.forEach(n->System.out.println(n));
		
		numbers.stream()
		.filter(MethodReferencingDemo2::checkPrime)
		.forEach(System.out::println);
		

}
	
	public static boolean checkPrime(int n)
	{
		int counter=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				counter++;
		}
		
		if(counter==2)
			return true;
		else
			return false;
	}
}
