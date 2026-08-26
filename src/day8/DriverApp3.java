package day8;

public class DriverApp3 {

	public static void main(String[] args) {
		
		
		Shape s1=()->{
			double result=Math.PI*5*5;
			return result;
		};
		
		
		double ans=s1.area();
		
		System.out.println("Area of circle of radius 5 is "+ans);
	}

}

