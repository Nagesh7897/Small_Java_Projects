import java.util.Scanner;

public class vagitablesale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("** AVAILABILITY OF VEGITABLES**");
		System.out.println("How many variety of vagitables you have");
		int item=scanner.nextInt();
		int id[]=new int[item];
		String des[]=new String[item];
		double rate[]=new double[item];
		int quant[]=new int[item];
		
		for(int i=0; i<item; i++)
		{
			System.out.println("Enter your  "+(i+1)+" id");
			id[i]=scanner.nextInt();
			System.out.println("Enter your  "+(i+1)+" Description");
			des[i]=scanner.next();
			System.out.println("Enter your  "+(i+1)+" rate");
			rate[i]=scanner.nextDouble();
			System.out.println("Enter your  "+(i+1)+" Quantity");
			quant[i]=scanner.nextInt();
		}
		
		System.out.println("Id      Description      Rate      Quantity");
		for(int i=0; i<item; i++)
		{
			System.out.println(id[i]+"       "+des[i]+"       "+rate[i]+"       "+quant[i] );
		}
		
		// Module-2
		
		String choise;
		int howmuchquantity[]=new int[item];
		double fbill=0;
		double bill[]=new double[item];
		
		System.out.println("** COUSTOMER PURCHASE**");
		for(int i=0; i<item; i++)         //Customer buy
		{
			System.out.println("Id      Description      Rate      Quantity");
			System.out.println(id[i]+"       "+des[i]+"         "+rate[i]+"       "+quant[i] );
			System.out.println("Would you like to purchase any thing from this list? ");
			System.out.println("y for yes");
			choise=scanner.next();
			if(choise.equals("y") || choise.equals("Y") )                                        //if variable is string then we need to write choise.equals
			{
				System.out.println("How much Quantity you want to add in cart");
				howmuchquantity[i]=scanner.nextInt();
				bill[i]=howmuchquantity[i]*rate[i];
				quant[i]=quant[i]-howmuchquantity[i];
				System.out.println(bill[i]);
				fbill=fbill+bill[i];
			}	
		}
		
		// Module-3
		System.out.println("** COUSTOMER Bill**");
		System.out.println("Id      Description      Rate      Quantity     Bill");
		for(int i=0; i<item; i++) 
		{
			System.out.println(id[i]+"       "+des[i]+"         "+rate[i]+"       "+howmuchquantity[i]+"       "+bill[i] );
		}
		
		System.out.println("                                 Final Bill =  "+fbill);
		
		
		
		for (int j=0;j<10;j++)
		{
		System.out.println("** COUSTOMER PURCHASE**");
		System.out.println("Any New Customer?");
		System.out.println("y for yes");
		fbill=0;
		String newCoustomer=scanner.next();
		if(newCoustomer.equals("y")) 
		{
			for(int i=0; i<item; i++)         //Customer buy
			{
				System.out.println("Id      Description      Rate      Quantity");
				System.out.println(id[i]+"       "+des[i]+"       "+rate[i]+"       "+quant[i] );
				System.out.println("Would you like to purchase any thing from this list? ");
				System.out.println("y for yes");
				choise=scanner.next();
				if (choise.equals("y") || choise.equals("Y") )
				{
					
					System.out.println("How much Quantity you want to add in cart");
					howmuchquantity[i]=scanner.nextInt();
					bill[i]=howmuchquantity[i]*rate[i];
					quant[i]=quant[i]-howmuchquantity[i];
					System.out.println(bill[i]);	
					fbill=fbill+bill[i];
				}
			}
				System.out.println("** COUSTOMER Bill**");
				System.out.println("Id      Description      Rate      Quantity     Bill");
				for(int i=0; i<item; i++)
				{
					System.out.println(id[i]+"       "+des[i]+"         "+rate[i]+"       "+howmuchquantity[i]+"       "+bill[i]);
				}
				
				System.out.println("                                 Final Bill =  "+fbill);
				
				}
		else
		{
			System.out.println("Thanks!!!");
			System.out.println("Please visit again.");
			break;
		}
		
	 	}
		scanner.close();
		}
		
	}


