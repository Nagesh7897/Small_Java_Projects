package MapProject;

import java.util.Scanner;

public class Chennai {
	public static void chennai()
	{
		System.out.println("Your Current Location is CHENNAI");
		
		System.out.println("1.  CHENNAI to SANGLI - 942 Km");
		System.out.println("2.  CHENNAI to MUMBAI - 1298 Km");
		System.out.println("3.  CHENNAI to KOLKATA - 1662 Km");
		System.out.println("4.  CHENNAI to BENGLURU - 346 Km");
		System.out.println("5.  CHENNAI to PUNE - 1156 Km");
		System.out.println("6.  Exit");
		
		Scanner scanner=new Scanner(System.in);
		int place=scanner.nextInt();
		
		switch(place) {
		case 1: 
			Controller.main(null);
			break;
			
		case 2:
			Mumbai.mumbai();
			break;
			
		case 3:
			Kolkata.kolkata();
			break;
			
		case 4:
			Bengaluru.bengaluru();
			break;
			
		case 5:
			Pune.pune();
			break;
			
		case 6:
			break;
			
		default:
				System.out.println("Invalid Input"); 
			
			
	}

		 scanner.close();
		
	}
}
