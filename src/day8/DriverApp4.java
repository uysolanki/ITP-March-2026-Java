package day8;

public class DriverApp4 {

	public static void main(String[] args) {
		
		
		Shape s1=()->Math.PI*5*5;
		double ans=s1.area();
		
		System.out.println("Area of circle of radius 5 is "+ans);
	}

}

