package day14;

public class InsertDriverApp {

	public static void main(String[] args) {
		InsertThread1 t1=new InsertThread1();
		InsertThread2 t2=new InsertThread2();
		InsertThread3 t3=new InsertThread3();
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
