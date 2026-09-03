package day13;

public class Alpha extends Thread {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=1000;i++)
			System.out.println(i);
	}
	
	public Alpha(String name)
	{
		super(name);
	}
}
