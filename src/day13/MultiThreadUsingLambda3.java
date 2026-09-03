package day13;

public class MultiThreadUsingLambda3 {

	public static void main(String[] args) {

		new Thread(()-> {
			for(int i=2001;i<=3000;i++)
				System.out.println(i);
			
		}).start();
	
		
		new Thread(()-> {
			for(int i=3001;i<=4000;i++)
				System.out.println("\t\t"+i);
			
		}).start();
	}

}
