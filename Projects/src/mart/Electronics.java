package mart;

import java.util.Scanner;

public class Electronics {
	public static double electronicsitems()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Available Items");
		System.out.println("1. Bulb      90 rs");
		System.out.println("2. Tubelight    160 rs");
		System.out.println("3. remote     120 rs");
		float quant;
		double bill = 0;
		int item=scanner.nextInt();
		
		if (item==1)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*90;
		}
		else if(item==2)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*160;
		}
		else if(item==3)
		{
			System.out.println("Please enter the Quantity");
			quant =scanner.nextFloat();
			bill= quant*120;
		}
		
		//scanner.close();
		return bill;
	}
}
