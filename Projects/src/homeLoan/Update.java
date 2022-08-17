package homeLoan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Update {
	public static void update() {
		 Connection con =DbConnection.dbConnection();
		
		try {
			Statement statement= con.createStatement();
			Scanner scanner=new Scanner(System.in);
			int updt;
			System.out.println("1. Name Update");
			System.out.println("2. Age");
			System.out.println("3. Loan Amount");
			System.out.println("4. Monthly Salary");
			System.out.println("5. Other EMI");
			System.out.println("Please Enter your Operation Number");
			updt=scanner.nextInt();
			int	id, age = 0, la,oe;
			double ms = 0;
			String name, query;
			int oemi = 0;
			String oes = null;
			
			double loanAmount=0;    //For AutomaticUpdate in Database
			double monsal=0;
			double oeemi=0;
			String status=null;
			double maxloan=0;
			
			
	switch(updt)
	{
		case 1 : 
				System.out.println("Please Enter Id number to update the Name");
				id=scanner.nextInt();
				System.out.println("Please Enter Name to Update");
				name=scanner.next();
				
				query="UPDATE `homeloantable` SET `Name` = '"+name+"' WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
				break;
				
		case 2: 
				{                              // this bracket is given for to avoid resultSet duplication to remove this bracket need to change result set name in all cases
				System.out.println("Please Enter Id number to update the Age");
				id=scanner.nextInt();
				System.out.println("Please Enter age to Update");
				age=scanner.nextInt();
			
				ResultSet resultSet=statement.executeQuery("Select * from homeloantable  where `Id`='"+id+"' ");           //This is used to fetch the data from 
				while(resultSet.next())
				{
					loanAmount=resultSet.getDouble(8);
					monsal=resultSet.getDouble(5);
					oeemi=resultSet.getDouble(7);
				}
				monsal=monsal-oeemi;
				monsal=monsal/2;
				double newloanamount=monsal*(60-age)*12;
				
				if (loanAmount<newloanamount)
				{
				System.out.println("Congratulation!!! ");
				System.out.println("Your loan has approved of "+ loanAmount); 
				status = "Approved";
				}
				else
				{
				System.out.println("Sorry!!! Your Load Request is Rejected");
				status = "Rjected";
				}
				
				query="UPDATE `homeloantable` SET `Age` = '"+age+"', `MaxLoan`='"+newloanamount+"', `LoanStatus`='"+status+"'  WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
				break;
				}
				
	   case 3 :
		     	{
				System.out.println("Please Enter Id number to update the Loan Amount");
				id=scanner.nextInt();
				System.out.println("Please Enter Loan Amount to Update");
				la=scanner.nextInt();
				
				ResultSet resultSet=statement.executeQuery("Select * from homeloantable  where `Id`='"+id+"' ");           //This is used to fetch the data from 
				while(resultSet.next())
				{
					maxloan=resultSet.getDouble(8);
					
				}
				
				if (loanAmount<maxloan)
				{
				System.out.println("Congratulation!!! ");
				System.out.println("Your loan has approved of "+ loanAmount); 
				status = "Approved";
				}
				else
				{
				System.out.println("Sorry!!! Your Load Request is Rejected");
				status = "Rjected";
				}
				
				query="UPDATE `homeloantable` SET  `LoanStatus`='"+status+"', `LoanAmount` = '"+la+"'  WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
				break;
		     	}
				
		case 4 :	
			{
				System.out.println("Please Enter Id number to update the Monthy Salary");
				id=scanner.nextInt();
				System.out.println("Please Enter Monthy Salary to Update");
				ms=scanner.nextInt();
				
				ResultSet resultSet=statement.executeQuery("Select * from homeloantable  where `Id`='"+id+"' ");           //This is used to fetch the data from 
				while(resultSet.next())
				{
					oeemi=resultSet.getDouble(7);
					age=resultSet.getInt(3);
					loanAmount=resultSet.getDouble(8);
				}
				ms=ms-oeemi;
				ms=ms/2;
				double newloanamount=ms*(60-age)*12;
				
				if (loanAmount<newloanamount)
				{
				System.out.println("Congratulation!!! ");
				System.out.println("Your loan has approved of "+ loanAmount); 
				status = "Approved";
				}
				else
				{
				System.out.println("Sorry!!! Your Load Request is Rejected");
				status = "Rjected";
				}
				
				query="UPDATE `homeloantable` SET `MonthlySalary` = '"+ms+"', `MaxLoan`='"+newloanamount+"', `LoanStatus`='"+status+"'  WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
				break;
			}
			
				
		case 5 :	
				System.out.println("Please Enter Id number to update the Other EMI Status");
				id=scanner.nextInt();
				System.out.println("Please Select the Option");
				System.out.println("1. Yes");
				System.out.println("2. No");
				oe=scanner.nextInt();
				
				if(oe==1) {
					oes="Yes";
					System.out.println("Please Enter the EMI Amount(Monthly)");
			    	oemi=scanner.nextInt();
				}
				else if(oe==1) {
					oes="No";
					oemi=0;
				}
				else
				{
					System.out.println("Invalid selection.");
				}
				
				ResultSet resultSet=statement.executeQuery("Select * from homeloantable  where `Id`='"+id+"' ");           //This is used to fetch the data from 
				while(resultSet.next())
				{
					ms=resultSet.getDouble(5);
					age=resultSet.getInt(3);
					loanAmount=resultSet.getDouble(8);
				}
				ms=ms-oemi;
				ms=ms/2;
				double newloanamount=ms*(60-age)*12;
				
				if (loanAmount<newloanamount)
				{
				System.out.println("Congratulation!!! ");
				System.out.println("Your loan has approved of "+ loanAmount); 
				status = "Approved";
				}
				else
				{
				System.out.println("Sorry!!! Your Load Request is Rejected");
				status = "Rjected";
				}
				
				query="UPDATE `homeloantable` SET `OtherEMI` = '"+oes+"',`OtherEMIpay` = '"+oemi+"', `MaxLoan`='"+newloanamount+"', `LoanStatus`='"+status+"' WHERE (`Id` = '"+id+"')";
				statement.executeUpdate(query);
				break;
				
			default :
				System.out.println("Invalid Option");
				
			}
			
			
			
		ResultSet rs=statement.executeQuery("Select * from homeloantable");         
			while(rs.next())
			{
				System.out.println(rs.getInt("Id")+"   "+rs.getString("Name")+"   "+rs.getInt("Age")+"   "+rs.getInt("LoanAmount")+"   "+rs.getInt("MonthlySalary")+"   "+rs.getString("OtherEMI")+rs.getInt("OtherEMIpay")+rs.getInt("MaxLoan")+"   "+rs.getString("LoanStatus"));
			}
			scanner.close();
		} 
		
		catch (Exception e)
		{
		System.out.println(e);
		}
	}
}