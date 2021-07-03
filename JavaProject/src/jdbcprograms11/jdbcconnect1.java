package jdbcprograms11;

import java.sql.*;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

public class jdbcconnect1 {
	
	//1. import the packsge  of mysql
  //load and ragister driver- com.mysql.jdbc.Driver
	//create a connection -conection interface
	//create a statements -statement interface;
	//execute query
	//process the result
	//closed connection
	public static void main(String[] args) {
		/*
		 * String url=""; String pass="root"; String uname="root"; String
		 * query="select name from students1 where id=2";
		 */
	   try {
	   Class.forName("com.mysql.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
       Statement st=con.prepareStatement(null);
      ResultSet rs=st.executeQuery("select name from students1 where id=2");
     
      //String name=rs.getString("name");
      System.out.println(rs.getString(1));
      st.close();
      con.close();
	   }catch(Exception e) {
		   
		   e.printStackTrace();
		   System.out.println(e);}

	}
}
