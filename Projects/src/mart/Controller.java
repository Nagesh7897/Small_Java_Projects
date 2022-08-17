package mart;

import java.util.Scanner;

public class Controller {
	
	public static double items()
	{
		double bill=0;
		Scanner scanner=new Scanner(System.in);
		

		System.out.println("Please select the section for purches");
		System.out.println("1. Cooking Related Items");
		System.out.println("2. Bathrooms");
		System.out.println("3. Gifts");
		System.out.println("4. Wearables");
		System.out.println("5. kids");
		System.out.println("6. Electronics");
		System.out.println("7. Worship");
	

		int section =scanner.nextInt();

		switch(section) {
			case 1 : 
				bill=Cooking.cookitems();
				break;
				
			case 2 :
				bill=Bathroom.btitems();
				break;
				
			case 3 :
				bill=	Gifts.giftitems();
				break;
				
			case 4 :
				bill=	Wearables.wearablesitems();
				break;
				
			case 5 :
				bill=Kids.kidsitems();
				break;
				
			case 6 :
				bill=	Electronics.electronicsitems();
				break;
				
			case 7 :
				bill=	Worship.worshipitems();
				break;
		}
		
		//scanner.close(); 
		return bill;
	}

}
