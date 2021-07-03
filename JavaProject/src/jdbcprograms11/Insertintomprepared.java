package jdbcprograms11;
import java.sql.*;
import java.sql.DriverManager;

public class Insertintomprepared {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement  pst=con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
		 pst.setInt(1, 2);
		 pst.setString(2, "mubashir");
		 pst.setString(3, "khan");
		 pst.setString(4, "mubashir@gamiol.com");
		 pst.setInt(5, 9999);
		 pst.setString(6, "saidaa khatoon");
		 
		 pst.executeUpdate();
		 System.out.println("successfull");
		 con.close(); 
	}

}
