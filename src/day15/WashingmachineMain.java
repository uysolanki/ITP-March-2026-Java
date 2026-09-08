package day15;

public class WashingmachineMain {

	public static void main(String[] args) throws InterruptedException {
		Rinse thread1=new Rinse();
		thread1.start();
		thread1.join(5000);
		
		Wash thread2=new Wash();
		thread2.start();
		thread2.join();
		
		Dry thread3=new Dry();
		thread3.start();
		
		

	}

}
