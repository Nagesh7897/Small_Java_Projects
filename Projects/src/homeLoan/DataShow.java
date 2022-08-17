package homeLoan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataShow {
public static void dataShow() {
	 Connection con =DbConnection.dbConnection();
	
	try {
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery("Select * from homeloantable");         
			while(rs.next())
			{
				System.out.println(rs.getInt("Id")+"   "+rs.getString("Name")+"   "+rs.getInt("Age")+"   "+rs.getInt("LoanAmount")+"   "+rs.getInt("MonthlySalary")+"   "+rs.getString("OtherEMI")+rs.getInt("OtherEMIpay")+rs.getInt("MaxLoan")+"   "+rs.getString("LoanStatus"));
			}

		} 
	catch (Exception e) {
		System.out.println(e);
		}
}
}
