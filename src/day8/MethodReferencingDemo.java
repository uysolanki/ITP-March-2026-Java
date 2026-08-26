package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferencingDemo {

	public static void main(String[] args) {
		
		
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		//display name of months having more than 5 chars
		months.stream()
		.filter(MethodReferencingDemo::checkStringLength)
		.forEach(month->System.out.println(month));
		

}
	
	public static boolean checkStringLength(String str)
	{
		if(str.length()>5)
			return true;
		else
			return false;
	}
}
