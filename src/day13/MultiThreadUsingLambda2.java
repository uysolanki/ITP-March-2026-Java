package day13;

public class MultiThreadUsingLambda2 {

	public static void main(String[] args) {

		
		Thread tx=null;
		
		tx=new Thread(()-> {
			for(int i=2001;i<=3000;i++)
				System.out.println(i);
			
		});
		tx.start();
		
		tx=new Thread(()-> {
			for(int i=3001;i<=4000;i++)
				System.out.println("\t\t"+i);
			
		});
		tx.start();
	}

}
