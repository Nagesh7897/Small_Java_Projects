package mart;

import java.util.Scanner;

public class Bathroom {

	public static double btitems()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Available Items");
		System.out.println("1. Brush      25 rs");
		System.out.println("2. Bucket     35 rs");
		System.out.println("3. odonil     20 rs");
		float quant;
		double bill = 0;
		int item=scanner.nextInt();
		
		if (item==1)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*25;
		}
		else if(item==2)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*35;
		}
		else if(item==3)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*20;
		}
		double tes=bill;
		
		//scanner.close();
		return tes;
	}
}
