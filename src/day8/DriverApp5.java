package day8;

public class DriverApp5 {

	public static void main(String[] args) {
		
		
		Print p1=(name)->System.out.println("Welcome to Pune, "+name);
		p1.print("Hitesh");
		
		Print p2=name->System.out.println("Welcome to Pune, "+name);
		p2.print("Paul");
	}

}

