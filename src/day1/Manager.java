package day1;

public class Manager extends Employee {
	
	private double ta;
	private String project;
	
	public Manager(int eno, String ename, double salary,double ta)
	{
		//super();
		this.ta=ta;
	}

	public Manager(int eno, String ename, double salary,double ta,String project)
	{
		super(eno,ename,salary);
		this.ta=ta;
		this.project=project;
	}

	@Override
	public String toString() {
		//System.out.println(super.toString());
		return super.toString() +" Manager [ta=" + ta + ", project=" + project + "]";
		
	}
	
	
}
