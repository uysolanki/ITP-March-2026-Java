package day3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Student2> batch=new ArrayList();
		
		batch.add(new Student2(18,"Virat",78.5));
		batch.add(new Student2(45,"Rohit",88.5));
		batch.add(new Student2(7,"Shivam",98.5));
		
		
		String searchedName="Rohit";
		int index=batch.indexOf(new Student2(searchedName));
		
		if(index==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found");
			}

}
