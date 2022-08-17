package bank.Thread;

public class FinalCall {

	public static void main(String[] args) {
	
		Bank bank=new Bank();
		for(int i=0; i<Bank.Max_acc;i++)
		{
			Thread thread=new Thread(new Transaction(bank, i));
			thread.start();
		}

	}

}
