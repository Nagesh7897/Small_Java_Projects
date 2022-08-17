package MapProject;

import java.util.Scanner;

public class Bengaluru {
	public static void bengaluru()
	{
		System.out.println("Your Current Location is BENGALURU");
		
		System.out.println("1.  BENGALURU to SANGLI - 660 Km");
		System.out.println("2.  BENGALURU to MUMBAI - 984 Km");
		System.out.println("3.  BENGALURU to KOLKATA - 1839 Km");
		System.out.println("4.  BENGALURU to PUNE - 840 Km");
		System.out.println("5.  BENGALURU to CHENNAI - 346 Km");
		System.out.println("6.  Exit");
		
		Scanner scanner=new Scanner(System.in);
		int place=scanner.nextInt();
		
		switch(place){
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
			Pune.pune();
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
