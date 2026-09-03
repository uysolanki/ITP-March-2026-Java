package day13;

public class MultiThreadDemo {

	public static void main(String[] args) {

		Alpha thread1=new Alpha();
		Beta thread2=new Beta();
		
		thread1.start();
		thread2.start();
	}

}
