package cefsa.ftt.ec.fttdatabase;

import java.sql.*;
import java.util.Date;
import com.microsoft.sqlserver.jdbc.*;

public class FTTDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new Date());
		System.out.println(" - FTT Database...");
		
		String connectionString = 
		"jdbc:sqlserver://localhost:1433;" +
		"database=tp2java;" +
		"user=sa;" +
		"password=123456;"; //+
		//"trustServerCertificate=false;" +
		//"hostNameInCertificate=*.database.windows.net;" +
		//"loginTimeout=30;";
		
		Connection connection = null;

			
			try {
			
				connection = DriverManager.
						getConnection(connectionString);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //try
		
			try {
				System.out.println(connection.getCatalog());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				
				Statement stm = connection.createStatement();
			
				ResultSet rs = stm.executeQuery("SELECT * FROM PEOPLE;");							
				
				while (rs.next()) {
					System.out.print(rs.getInt("ID"));
					System.out.println(" - " + rs.getString("NAME"));
				} //while
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //try
			
			

		
	}

}
