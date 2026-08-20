package day1;

public class Test {

	public static void main(String[] args) {
		int a;
		double b;
		boolean c;
		
		//System.out.println(a);
		
		Demo d=new Demo();
		System.out.println(d);
		
		Demo d1=new Demo(7,99.9, false);
		System.out.println(d1);
		
		Demo d2=new Demo(d1);
		System.out.println(d2);

		Demo d3=new Demo(9);
		System.out.println(d3);
		
		Demo d4=new Demo(9,108.7);
		System.out.println(d4);
		
		Demo d5=new Demo(7,99.9, true);
		System.out.println(d5);
		
		
		Manager m1=new Manager(101,"Alice",800.0,200.0);
		System.out.println(m1);
		
		Manager m2=new Manager(101,"Alice",800.0,200.0,"Metro");
		System.out.println(m2);
		
	}

}
