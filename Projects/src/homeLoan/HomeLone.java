package homeLoan;

import java.util.Scanner;

public class HomeLone {

	public static void main(String[] args) {
		int option;
		System.out.println("1. Show Data");
		System.out.println("2. Add Data");
		System.out.println("3. Delete");
		System.out.println("4. Update");
		
		System.out.println("Please Enter your Operation Number");
		Scanner scanner=new Scanner(System.in);
		option= scanner.nextInt();
		
		switch(option) {
		
		case 1 : DataShow.dataShow();
		         break;
		          
		case 2 : Datacall.datacall();
		         break;
		
		case 3 : Delete.delete();
	             break;
		         
	    case 4 :Update.update();
	             break;
		        
	    default: System.out.println("Invalid Option");
		}	 
				
		 scanner.close();
	}
}
	
