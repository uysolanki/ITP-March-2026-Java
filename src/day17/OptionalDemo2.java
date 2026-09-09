package day17;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {
		Optional<String> user=getUser(1);
		System.out.println("Welcome, " +user.orElse("Please register"));

	}

	private static Optional<String> getUser(int n) {
		if(n==1)
			return Optional.of("Rahul");
		else
			return Optional.empty();
		
	}

}
