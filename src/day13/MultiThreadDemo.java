package day13;

public class MultiThreadDemo {

	public static void main(String[] args) {

		Alpha thread1=new Alpha("Apple");
		Beta thread2=new Beta("Mango");
		
		thread1.run();
		thread2.run();
	}

}
