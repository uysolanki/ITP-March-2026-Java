package day1;

public class Employee {
	
	int eno;
	String ename;
	double salary;
	
	public Employee()
	{
		eno=1;
		ename="Unknown";
		salary=1000.0;
	}
	
	
	public Employee(int eno)
	{
		this.eno=eno;
	}
	
	public Employee(int eno,String ename)
	{
		this(eno);
		this.ename=ename;	
	}
	
	public Employee(int eno,String ename,double salary)
	{
		this(eno,ename);
		this.salary=salary;	
	}


	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
}
