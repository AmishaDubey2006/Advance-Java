package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
 public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "root");
	Statement stmt = conn.createStatement();
	//int i = stmt.executeUpdate("Update marksheet set name = 'Abhir'  where name = 'ram' ");
	int i = stmt.executeUpdate("Update marksheet set Roll_no =1452016  where name = 'Abhir' ");
	System.out.println("Data Updated =" + i );
}

}
