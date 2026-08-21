package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vector1=new Vector();  //NoArgsConstructor - Default Capacity Default Increment double
		vector1.add("Alice");
		
		System.out.println("CAPACITY "+vector1.capacity());
		System.out.println("SIZE "+vector1.size());
		
		//size > capacity
		//vector default increment double
		
		for(int i=1;i<=9;i++)
			vector1.add("Alice");
		
		System.out.println("CAPACITY "+vector1.capacity());
		System.out.println("SIZE "+vector1.size());
		
		vector1.add("Alice");
		
		System.out.println("CAPACITY "+vector1.capacity());
		System.out.println("SIZE "+vector1.size());
		
		System.out.println("*****");
		Vector<String> vector2=new Vector(5);	//single parameter used defined capacity, Default Increment double
		System.out.println("CAPACITY "+vector2.capacity());
		System.out.println("SIZE "+vector2.size());
		
		for(int i=1;i<=6;i++)
			vector2.add("Alice");
		
		System.out.println("CAPACITY "+vector2.capacity());
		System.out.println("SIZE "+vector2.size());
		System.out.println("###########");
		Vector<String> vector3=new Vector(5,3); //double parameter used defined capacity, used defined Increment
	
		System.out.println("CAPACITY "+vector3.capacity());
		System.out.println("SIZE "+vector3.size());
		
		for(int i=1;i<=6;i++)
			vector3.add("Alice");
		
		System.out.println("CAPACITY "+vector3.capacity());
		System.out.println("SIZE "+vector3.size());
		
		
		List<Integer> oddNumbers=new ArrayList();
		Vector<String> vector4=new Vector(oddNumbers);
		
		//legacy class java 1.0
		
	}

}



//Array						Collection (ArrayList)

//1. fixed length			growable in nature
//int[3];                    new Vector(3)
//[1,2,3] AIOOBE            [1,2,3]