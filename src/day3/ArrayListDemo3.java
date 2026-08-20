package day3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		List<Student3> batch=new ArrayList();
		
		batch.add(new Student3(18,"Virat",78.5));
		batch.add(new Student3(45,"Rohit",88.5));
		batch.add(new Student3(7,"Shivam",98.5));
		
		
		String searchedName= "Rohit";
		//int searchedName=45;
		int index=batch.indexOf(searchedName);
		
		if(index==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found");
			}
}
