package day1;

public class Demo {
	int a;
	double b;
	boolean c;
	
	public Demo()		//NoArgsConstructor
	{
		a=1;
		b=1.1;
		c=true;
	}
	
	

	
	public Demo(Demo dx)		//copy Constructor
	{
		a=dx.a;
		b=dx.b;
		c=dx.c;
	}
	
	
	
	
	public Demo(int x)
	{
		a=x;
	}
	
	public Demo(int x,double y)
	{
		this(x);
		b=y;
	}
	
	public Demo(int x, double y, boolean z)		//AllArgsConstructor
	{
		this(x,y);
		c=z;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}
