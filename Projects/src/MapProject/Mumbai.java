package MapProject;

import java.util.Scanner;

public class Mumbai {
	public static void mumbai()
	{
		System.out.println("Your Current Location is MUMBAI");
		
		System.out.println("1.  MUMBAI to SANGLI - 376 Km");
		System.out.println("2.  MUMBAI to PUNE - 148 Km");
		System.out.println("3.  MUMBAI to KOLKATA - 1912 Km");
		System.out.println("4.  MUMBAI to BENGLURU - 984 Km");
		System.out.println("5.  MUMBAI to CHENNAI - 1298 Km");
		System.out.println("6.  Exit");
		
		Scanner scanner=new Scanner(System.in);
		int place=scanner.nextInt();
		
		switch(place){
		case 1: 
			Controller.main(null);
			break;
			
		case 2:
			Pune.pune();
			break;
			
		case 3:
			Kolkata.kolkata();
			break;
			
		case 4:
			Bengaluru.bengaluru();
			break;
			
		case 5:
			Chennai.chennai();
			break;
			
		case 6:
			break;
			
		default:
				System.out.println("Invalid Input");
			
			
	}
		 scanner.close();

		
		
	}
}
