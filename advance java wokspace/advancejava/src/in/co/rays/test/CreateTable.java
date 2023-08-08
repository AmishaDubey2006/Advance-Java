package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement stmt = conn.createStatement();
	  
	//	int i = stmt.executeUpdate(" create table TCS(id int primary key,name varchar(80),salary int)");
		
	int  i = stmt.executeUpdate(" insert into TCS values(7,'Priyanshu Sahu',20000)");
		 i = stmt.executeUpdate(" insert into TCS values(8,'Rahul Sharma',30000)");
    	 i = stmt.executeUpdate(" insert into TCS values(9,'Rudra Prajapat',35000)");
		 i = stmt.executeUpdate(" insert into TCS values(10,'Ritika Tiwari',20000)");
		 i = stmt.executeUpdate(" insert into TCS values(11,'Reema Chauhan',40000)");
		 i = stmt.executeUpdate(" insert into TCS values(12,'Himangi Bhatt',45000)");
		
		//System.out.println("Table Created");
		System.out.println("Data Inserted =" + i);
	}

}
