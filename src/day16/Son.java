package day16;

public class Son extends Thread {
	Bank bank;
	
	public Son(Bank bank)
	{
		this.bank=bank;
	}

	@Override
	public void run() {
		try {
			bank.withdraw(10000.0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
