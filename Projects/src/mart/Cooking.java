package mart;

import java.util.Scanner;

public class Cooking {

	
	public static double cookitems()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Available Items");
		System.out.println("1. Rice      40 rs/kg");
		System.out.println("2. Suger     60 rs/kg");
		System.out.println("3. wheat     30 rs/kg");
		float quant;
		double bill = 0;
		int item=scanner.nextInt();
		
		if (item==1)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*40;
			
		}
		else if(item==2)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*60;
		}
		else if(item==3)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*30;
		}
		
		//scanner.close();
		return bill;
	}
	
	
}
