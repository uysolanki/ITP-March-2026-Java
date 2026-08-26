package day8;

public class DriverApp6 {

	public static void main(String[] args) {
		
		
		Welcome w1=(name,city)->System.out.println("Welcome to " + city +", "+name);
		w1.greet("Hitesh","Pune");
		
		Welcome w2=(name,city)->System.out.println("Welcome to " + city +", "+name);
		w1.greet("Paul","Delhi");
	}

}

