package mart;

import java.util.Scanner;

public class Gifts {

	public static double giftitems()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Available Items");
		System.out.println("1. Teadybear      300 rs");
		System.out.println("2. KeyChains    40 rs");
		System.out.println("3. Ring     150 rs");
		float quant;
		double bill = 0;
		int item=scanner.nextInt();
		
		if (item==1)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*300;
		}
		else if(item==2)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*40;
		}
		else if(item==3)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*150;
		}
		
		//scanner.close();
		return bill;
	}
}
