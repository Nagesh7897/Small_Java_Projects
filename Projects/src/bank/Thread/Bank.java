package bank.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Bank {
	public static final int Max_acc=10;
	public static final int Opening_balanace=1000;
	
	Account[] accounts= new Account[Max_acc];
	
	private Lock bankLock;
	private Condition fund;
	
	public Bank() {
		System.out.println("I was Called");
		for(int i=0;i<accounts.length;i++)
		{
			accounts[i]=new Account(Opening_balanace);
		}
		bankLock= new ReentrantLock();
		fund= bankLock.newCondition();
	}

	
	public void transfer(int from,int to, int amount)
	{
		bankLock.lock();
		
		try {
			while(accounts[from].getBalance()<amount)
			{
			 fund.await();                  
		//	   wait();
			}
		
//		
//		if(amount<=accounts[from].getBalance())
//		{
			accounts[from].withdrow(amount);
			accounts[to].deposit(amount);
			String threadTransfer=Thread.currentThread().getName();
			System.out.printf("%s transferd %d from %s to %s, Total Balabce %d \n", threadTransfer, amount, from, to, getTotalBalance());
//		}
		  fund.signalAll();                
	//		notifyAll();
	}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			bankLock.unlock();
		}
	}
	
	public int getTotalBalance() {
		bankLock.lock();
		int rest=0;
		try {
		for(int i=0;i<accounts.length;i++)
		{
			rest=rest+accounts[i].getBalance();
		}
	
		}
		finally {
			bankLock.unlock();
		}
		return rest;
	}
}
