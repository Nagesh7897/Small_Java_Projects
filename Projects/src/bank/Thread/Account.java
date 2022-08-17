package bank.Thread;

public class Account {
	int balance=0;
	
	public Account(int balance) {
		this.balance=balance;
	}
	
	public void withdrow(int amount) {
		this.balance=this.balance-amount;
	}

	public void deposit(int amount) {
		this.balance=this.balance+amount;
		
	}
	protected int getBalance() {
		return balance;
	}
}
