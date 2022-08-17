package mart;

import java.util.Scanner;

public class Wearables {
	
	public static double wearablesitems()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Available Items");
		System.out.println("1. T-shirt      250 rs");
		System.out.println("2. Shirt    400 rs");
		System.out.println("3. Pant     800 rs");
		float quant;
		double bill = 0;
		int item=scanner.nextInt();
		
		if (item==1)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*250;
		}
		else if(item==2)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*400;
		}
		else if(item==3)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*800;
		}
		
		//scanner.close();
		return bill;
	}
}
