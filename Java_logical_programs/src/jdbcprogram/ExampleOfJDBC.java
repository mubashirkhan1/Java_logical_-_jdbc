package jdbcprogram;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class ExampleOfJDBC {
	public static void main(String args[]){  
		try{ 
	System.out.println("okkkkkkk");
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=(Connection) DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/mubashir?characterEncoding=latin1","root","root");  
		System.out.println("connection okk");
		
		Statement stmt=(Statement) con.createStatement();  
		ResultSet rs=(ResultSet) stmt.executeQuery("select * from Persons");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
}
