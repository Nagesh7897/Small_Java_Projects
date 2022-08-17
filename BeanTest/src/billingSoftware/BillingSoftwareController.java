package billingSoftware;

import java.util.Scanner;

public class BillingSoftwareController {

	public static void main(String[] args) {
	
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please select option, what you want to do?");
			System.out.println("1. Add Product(Seller)");
			System.out.println("2. Buy Product(Buyer)");
			
			int choice=scanner.nextInt();
			
			if(choice==1) {
				BillingSoftwareSeller bss=new BillingSoftwareSeller();
				bss.addProduct();
			}
			
			else if(choice==2) {
				BillingSoftwareBuyer bsb=new BillingSoftwareBuyer();
				bsb.buyer();
			}
			
			else
			{
				System.out.println("Invalid Input");
			}
		}
	}

}
