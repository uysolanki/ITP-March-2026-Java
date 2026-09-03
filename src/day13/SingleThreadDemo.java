package day13;

public class SingleThreadDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=1000;i++)
			System.out.println(i);
		
		//code
		for(int i=1001;i<=2000;i++)
			System.out.println("\t\t" +i);

	}

}
