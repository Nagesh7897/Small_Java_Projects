package MapProject;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {

	System.out.println("Your Current Location is SANGLI");
	System.out.println(" ");
	Scanner scanner=new Scanner(System.in);
	int place;
		
	System.out.println("1.  SANGLI to PUNE - 240 Km");
	System.out.println("2.  SANGLI to MUMBAI - 376 Km");
	System.out.println("3.  SANGLI to KOLKATA - 1902 Km");
	System.out.println("4.  SANGLI to BENGLURU - 660 Km");
	System.out.println("5.  SANGLI to CHENNAI - 942 Km");
	System.out.println("6.  Exit");
	place=scanner.nextInt();
	
	switch(place){
		case 1: 
			Pune.pune();
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
