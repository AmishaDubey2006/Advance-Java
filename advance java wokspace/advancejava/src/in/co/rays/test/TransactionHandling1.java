package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHandling1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");	
			
		    Class.forName ("com.mysql.cj.jdbc.Driver");
		    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		    conn.setAutoCommit(false);
		    Statement stmt = conn.createStatement();
		    int i = stmt.executeUpdate(" insert into marksheet values(17,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(18,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(19,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(19,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(20,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(21,'ram',145200,11,33,44,18)");
		    i = stmt.executeUpdate(" insert into marksheet values(22,'ram',145200,11,33,44,18)");
		    System.out.println("Data Inserted =" + i);
		    conn.commit();
		    
		

	}}



