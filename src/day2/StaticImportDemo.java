package day2;

import java.util.Scanner;
import static java.lang.Math.*;
public class StaticImportDemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	int j=700;
	int p=2000;
	
	int dist=abs(p-j);                //static function
	System.out.println(dist);
	
	int radius=5;
	double area=PI*radius*radius;   //static variable
	System.out.println("Property sold for "+area);
	}

}


//78.50 cr