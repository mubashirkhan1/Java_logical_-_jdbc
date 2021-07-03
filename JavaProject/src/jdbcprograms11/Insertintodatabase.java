package jdbcprograms11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertintodatabase {
	public static void main(String[] args) throws Exception {
		//try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement st=con.createStatement();
		String record="insert into students values(null,'javed',65555,'usa',888)";
		st.executeUpdate(record);
		System.out.println("succesfully");
		//ResultSet rs=st.executeQuery("select  * from  students");
	}

}
