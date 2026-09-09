package day17;

import java.util.Optional;

public class OptionalDemo4 {

	public static void main(String[] args) {
		try
		{
		Optional<String> user=getUser(2);
		System.out.println("Welcome, " +user.orElseThrow( ()-> new CustomerNotFoundException("Customer does not exist") ));
		}
		catch(CustomerNotFoundException ex1)
		{
			System.out.println(ex1.getMessage());
		}
	}

	private static Optional<String> getUser(int n) {
		if(n==1)
			return Optional.of("Rahul");
		else
			return Optional.empty();
		
	}

}
