package jdbcprograms11;
import java.sql.*;
public class Connectwithjdbc {
	public static void main(String[] args) throws Exception{
		//try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select  * from  students");
		//ResultSet rs=ps.executeQuery();  
		ResultSetMetaData rsmd=rs.getMetaData();  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
		while (rs.next()) {
			System.out.println( rs.getInt(1)+" + "+rs.getString(2)+" + " +rs.getLong(3)+" + "+rs.getString(4)+" +"+rs.getInt(5));
	
		
	//	}
		//}catch(Exception e) {System.out.println(e);
		//e.printStackTrace();
		}
		st.close();
		con.close();
		
		
		}
		}
		
	


