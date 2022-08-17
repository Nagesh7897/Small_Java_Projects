package homeLoan;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Datacall {
	
	public static void datacall() {
		Scanner scanner=new Scanner(System.in);
		int ea=0, age, rage;
		double total = 0,loan;
		String status;
	
		System.out.println("Please enter ID");
		int id = scanner.nextInt();
		System.out.println("Please enter your Name");
		String name = scanner.next();
		System.out.println("Please enter your Amount for Loan");
		int lo = scanner.nextInt();
		System.out.println("Please enter your Salary (Month)");
		int sal = scanner.nextInt();
		
		int as = (sal * 12);      //annual salary
		
		
		System.out.println("Is there any other EMI ?");
		System.out.println("Y for Yes");
		System.out.println("N for No");
		String choise =scanner.next();
			if(choise.equals("y") || choise.equals("Y") ) 
				{
					System.out.println("Please Enter the amount you are paying per month?");
					ea=scanner.nextInt();
					total= (as-(ea*12))/2 ;
					choise= "Yes";
				}
			else if (choise.equals("n") || choise.equals("N") ) 
				{
					total= as/2 ;
					choise= "No";
				}	
			else
			{
				System.out.println("Invalid input");
			}
		System.out.println("Please Enter your Age");
		age= scanner.nextInt();
		rage= 60- age;
		loan= rage*total;
			if (lo<loan)
			{
			System.out.println("Congratulation!!! ");
			System.out.println("Your loan has approved of "+ lo); 
			status = "Approved";
			}
			else
			{
			System.out.println("Sorry!!! Your Load Request is Rejected");
			status = "Rjected";
			}	
     scanner.close();
     
     Connection con =DbConnection.dbConnection();
		
		try {
			Statement statement= con.createStatement();
		    String quary=  "INSERT INTO `homelone`.`homeloantable` (`Id`, `Name`, `Age`, `LoanAmount`, `MonthlySalary`, `OtherEMI`, `OtherEMIpay`, `MaxLoan`, `LoanStatus`) VALUES ('"+id+"', '"+name+"','"+age+"','"+lo+"','"+sal+"','"+choise+"','"+ea+"','"+loan+"','"+status+"')";
		      statement.executeUpdate(quary);
		      System.out.println("Data Entered!");	
		} 
		
		catch (Exception e) {
			System.out.println(e);
		}
		}
	}
