package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TestAdd {
	public static void main(String[] args) throws Exception {
		Class.forName ("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	    Statement stmt = conn.createStatement();
	    int i = stmt.executeUpdate(" insert into marksheet values(50,'ram',145200,11,33,44,18)");
	     i = stmt.executeUpdate(" insert into marksheet values(51,'ram',145200,11,33,44,18)");
	     i = stmt.executeUpdate(" insert into marksheet values(52,'ram',145200,11,33,44,18)");
	     i = stmt.executeUpdate(" insert into marksheet values(53,'ram',145200,11,33,44,18)");
	     i = stmt.executeUpdate(" insert into marksheet values(54,'ram',145200,11,33,44,18)");
	     i = stmt.executeUpdate(" insert into marksheet values(55,'ram',145200,11,33,44,18)");
	    System.out.println("Data Inserted =" + i);
	}

}
