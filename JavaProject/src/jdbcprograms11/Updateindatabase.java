package jdbcprograms11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Updateindatabase {
	public static void main(String[] args) throws Exception {
		//try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement st=con.createStatement();
		//String s1="update  students set  name='mubashir'where id=2";
		String s1="delete from students where id=6   ";
		st.executeUpdate(s1);
		System.out.println("successful");

}
}