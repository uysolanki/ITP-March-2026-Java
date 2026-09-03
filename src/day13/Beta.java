package day13;

public class Beta extends Thread {

	@Override
	public void run() {
		for(int i=1001;i<=2000;i++)
			System.out.println("\t\t"+i);
	}
}