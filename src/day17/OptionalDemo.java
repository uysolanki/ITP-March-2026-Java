package day17;

public class OptionalDemo {

	public static void main(String[] args) {
		String user=getUser(1);
		if(user!=null)
		System.out.println("Welcome, "+user);
		else
		System.out.println("Please register");

	}

	private static String getUser(int n) {
		if(n==1)
			return "Alice";
		else
			return null;
		
	}

}
