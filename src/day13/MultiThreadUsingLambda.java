package day13;

public class MultiThreadUsingLambda {

	public static void main(String[] args) {

		Runnable thread1=()-> {
			for(int i=2001;i<=3000;i++)
				System.out.println(i);
			
		};
		
		Runnable thread2=()-> {
			for(int i=3001;i<=4000;i++)
				System.out.println("\t\t"+i);
			
		};
		
		Thread tx=null;
		
		tx=new Thread(thread1);
		tx.start();
		
		tx=new Thread(thread2);
		tx.start();
	}

}
