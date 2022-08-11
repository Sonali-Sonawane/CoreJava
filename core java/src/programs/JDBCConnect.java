package programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnect {

	public static void main(String[] args) throws Exception {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Sonali","root","Sonali@123");
			
			Statement smt = con.createStatement();
			smt.executeUpdate("create table emp(eno int, ename varchar(255), esal int)");
			
			System.out.println("Table created Successfully...");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}