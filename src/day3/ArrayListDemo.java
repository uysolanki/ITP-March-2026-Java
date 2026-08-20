package day3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Student> batch=new ArrayList();
		
		batch.add(new Student(18,"Virat",78.5));
		batch.add(new Student(45,"Rohit",88.5));
		batch.add(new Student(7,"Shivam",98.5));
		
		
		String searchedName="Shivam";
		int flag1=0;  //assume : not found
		for(Student student:batch)
		{
			boolean result=student.search(searchedName);
			if(result==true)
			{
				System.out.println("Found");
				flag1=1;
				break;
			}
		}
		
		if(flag1==0)
			System.out.println("Not Found");
		
		
		int searchedRno=46;
		int flag2=0;  //assume : not found
		for(Student student:batch)
		{	boolean result=student.search(searchedRno);
			if(result==true)
			{
				System.out.println("Found");
				flag2=1;
				break;
			}
		}
		
		if(flag2==0)
			System.out.println("Not Found");
		
	}

}
