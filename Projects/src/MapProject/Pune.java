package MapProject;

import java.util.Scanner;

public class Pune {
public static void pune()
{
	System.out.println("Your Current Location is PUNE");
	
	System.out.println("1.  PUNE to SANGLI - 240 Km");
	System.out.println("2.  PUNE to MUMBAI - 148 Km");
	System.out.println("3.  PUNE to KOLKATA - 1827 Km");
	System.out.println("4.  PUNE to BENGLURU - 840 Km");
	System.out.println("5.  PUNE to CHENNAI - 1156 Km");
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
