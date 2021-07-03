package Synchronisation_program;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Fetchvalue 
{

	public static void main(String[] args) 
	{
		System.out.println("hii");
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubashir?characterEncoding=latin1","root","root");  
 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		 
			}
			con.close();
		}
		
			catch(Exception e)
			{
				
				System.out.println(e);
			}  
		
		

	}

}
