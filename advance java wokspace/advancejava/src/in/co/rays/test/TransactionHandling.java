package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHandling {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		try {
			Class.forName ("com.mysql.cj.jdbc.Driver");
		    DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		    Statement stmt = conn.createStatement();
		    int i = stmt.executeUpdate(" insert into marksheet values(22,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(23,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(24,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(25,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(26,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(27,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(22,'ram',145200,11,33,44,18)");
		    System.out.println("Data Inserted =" + i);
		}catch (Exception e) {
			System.out.println(e + " :- Process is wrong ");
	}

	}}
