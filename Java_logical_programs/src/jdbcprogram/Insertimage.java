package jdbcprogram;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertimage 

{
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mubashir?characterEncoding=latin1","root","root"); 
		
		PreparedStatement ps=con.prepareStatement("insert into IMAGE values(?,?)");  
		ps.setInt(1,1);  
		FileInputStream fin=new FileInputStream("D:\\second.jpg");
		ps.setBinaryStream(2, fin,fin.available());
		int v=ps.executeUpdate();
		System.out.println("succesfull");
		//D:\img.jpg
	}
}
