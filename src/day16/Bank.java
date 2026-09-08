package day16;

public class Bank {
	
	private double balance;
	
	public Bank(double balance)
	{
		this.balance=balance;
	}
	
	public synchronized void withdraw(double witdrawAmount) throws InterruptedException
	{
		if(witdrawAmount>balance)
		{
			System.out.println("Insufficient Funds");
			System.out.println("Son waiting for funds.....");
			wait();
			
		}
		balance-=witdrawAmount;
		System.out.println("withdrwal successful");
		System.out.println("Balance is "+balance);
	}
	
	public synchronized void deposit(double depositAmount)
	{
		balance+=depositAmount;
		notify();
	}

	public double getBalance() {
		return balance;
	}

	
}
