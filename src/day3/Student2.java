package day3;

import java.util.Objects;

public class Student2 {
	

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(studentName, ((Student2)obj).studentName);
	}

	private int rno;						
	private String studentName;				
	private double per;						
	
	
	
	Student2(int rno)
	{
		this.rno=rno;
	}

	Student2(String studentName)
	{
		this.studentName=studentName;
	}
	
	Student2(int rno,String studentName)
	{
		this(rno);
		this.studentName=studentName;
	}
	Student2(int rno,String studentName,double per)
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
