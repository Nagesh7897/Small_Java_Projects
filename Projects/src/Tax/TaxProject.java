package Tax;

import java.util.Scanner;

public class TaxProject {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your salary (Monthy)?");
		double salary=scanner.nextDouble();
		double tax=0 , rem=0,total=0;
		salary=salary*12;
		System.out.println("What is your salary (Annual) = " +salary );
		if (salary<=500000)
		{
			System.out.println("No Tax");
		}
		else if (salary>500000  && salary<=1000000)
		{
			rem=salary-500000;
			total=rem*0.2;
			System.out.println("Tax = "+ tax);
		}
		else if (salary>1000000  && salary<=2000000)
		{
			rem=salary-1000000;
			tax= rem*0.3;
			total=tax+(500000*0.2);
			System.out.println("Tax = "+ total);
		}
		else if (salary>2000000  && salary<=3000000)
		{
			rem=salary-2000000;
			tax= rem*0.4;
			total=tax + (500000*0.2)+ (1000000*0.3);
			System.out.println("Tax = "+total);
		}
		else if (salary>3000000)
		{
			rem=salary-3000000;
			tax= rem*0.5;
			total=tax + (500000*0.2)+ (1000000*0.3)+(1000000*0.4);
			System.out.println("Tax = "+total);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		scanner.close();
	}

}
