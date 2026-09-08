package day15;

public class Rinse extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=15;i++)
		{
			System.out.println("Rinse "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
