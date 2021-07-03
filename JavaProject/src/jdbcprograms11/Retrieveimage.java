package jdbcprograms11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.FileOutputStream;
import java.sql.*;




public class Retrieveimage {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root"); 
		
		PreparedStatement v=con.prepareStatement("select * from image");  
		ResultSet rs=v.executeQuery();
		if(rs.next())
		{
			Blob b=rs.getBlob(2);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			              
			FileOutputStream fout=new FileOutputStream("D:\\img.jpg");  
			fout.write(barr);  
			fout.close();
			
		}
	System.out.println("ok");  
    
con.close();  
	}
}
