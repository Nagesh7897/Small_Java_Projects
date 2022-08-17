package mart;

import java.util.Scanner;

public class Worship {
	public static double worshipitems()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Available Items");
		System.out.println("1. Banana Leaves      20 rs/pis");
		System.out.println("2. Bells    125 rs");
		System.out.println("3. Diya     40 rs");
		float quant;
		double bill = 0;
		int item=scanner.nextInt();
		
		if (item==1)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*20;
		}
		else if(item==2)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*125;
		}
		else if(item==3)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*40;
		}
		
		//scanner.close();
		return bill;
	}
}
