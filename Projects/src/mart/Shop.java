package mart;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);

	System.out.println("Welcome To Mart");
	System.out.println("what is your budget?");
	double budget=scanner.nextInt();
	
	 double x= Controller.items();  
	
	double finalbill =0; 
	finalbill=finalbill+x;

	System.out.println("Final bill = " + finalbill );
	
	if (finalbill<budget)
	{
		System.out.println("Thank you!");
	}
	else
	{
		System.out.println("Your Bill is more than Your Budget");
	}

	String res="";	
	for (int i=0; i<10; i++)
	 {

		System.out.println("would like to buy anything else ?");
		System.out.println("Y for Yes & N for No ");
		
            res=scanner.next();
			if (res.equals("y") || res.equals("Y") )
		    {
				x=0;
		       x= Controller.items();
				finalbill =finalbill+x;
			System.out.println("Final bill = " + finalbill );
		    }
		    else  if(res.equals("N") || res.equals("n"))
		    {
		    	System.out.println("Thank you!!!");
		    	System.out.println("Final bill = " + finalbill );
		    	i=10;                           //break
		    }
		    else {
		    	System.out.println("Invalid Input");
		    }

	if (finalbill<budget)
	{
		System.out.println(" ");
	}
	else
	{
		System.out.println("Your Bill is more than Your Budget");
	}
	}
//scanner.close();
	}

}
