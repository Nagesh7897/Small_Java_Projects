package mart;

import java.util.Scanner;

public class Kids {
	public static double kidsitems()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Available Items");
		System.out.println("1. T-shirt      80 rs");
		System.out.println("2. toys    140 rs");
		System.out.println("3. panpurs     12 rs/pis");
		float quant;
		double bill = 0;
		int item=scanner.nextInt();
		
		if (item==1)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*80;
		}
		else if(item==2)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*140;
		}
		else if(item==3)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*12;
		}
		
		//scanner.close();
		return bill;
	}
}
