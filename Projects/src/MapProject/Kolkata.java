package MapProject;

import java.util.Scanner;

public class Kolkata {
	public static void kolkata()
	{
		System.out.println("Your Current Location is KOLKATA");
		
		System.out.println("1.  KOLKATA to SANGLI - 1902 Km");
		System.out.println("2.  KOLKATA to MUMBAI - 1912 Km");
		System.out.println("3.  KOLKATA to PUNE - 1827 Km");
		System.out.println("4.  KOLKATA to BENGLURU - 1839 Km");
		System.out.println("5.  KOLKATA to CHENNAI - 1662 Km");
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
			Pune.pune();
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
