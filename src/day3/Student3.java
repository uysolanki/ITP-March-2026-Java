package day3;

import java.util.Objects;

public class Student3 {
	

	

	@Override
	public boolean equals(Object obj) {
		System.out.println("1");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
		{
			System.out.println("2");
			if(obj instanceof Integer)
			{
				Student3 student =new Student3((Integer)obj);
				return Objects.equals(rno, student.rno);
			}
			
			if(obj instanceof String)
			{
				Student3 student =new Student3((String)obj);
				return Objects.equals(studentName, student.studentName);
			}
			
		}
		return false;
	}

	private int rno;						
	private String studentName;				
	private double per;						
	
	
	
	Student3(int rno)
	{
		this.rno=rno;
	}

	Student3(String studentName)
	{
		this.studentName=studentName;
	}
	
	Student3(int rno,String studentName)
	{
		this(rno);
		this.studentName=studentName;
	}
	Student3(int rno,String studentName,double per)
	{
		this(rno,studentName);
		this.per=per;
	}

	@Override
	public String toString() {
		return "Student2 [rno=" + rno + ", studentName=" + studentName + ", per=" + per + "]";
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
	
	public boolean search(String name)
	{
		return this.studentName.equals(name);
	}

	public boolean search(int searchedRno) {
		if(this.rno==searchedRno)
			return true;
		else
			return false;
	}
	
}
