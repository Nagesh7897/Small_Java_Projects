package homeLoan;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection dbConnection()
	{
		 Connection con=null;
		try
		{  
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   con = DriverManager.getConnection("jdbc:mysql://localhost:3307/homelone", "root", "root");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
