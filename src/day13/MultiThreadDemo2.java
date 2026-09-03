package day13;

public class MultiThreadDemo2 {

	public static void main(String[] args) {

		Bravo thread1=new Bravo ();
		Charlie thread2=new Charlie();
	
		Thread tx=null;
		tx=new Thread(thread1);
		tx.start();
		
		tx=new Thread(thread2);
		tx.start();
	}

}
