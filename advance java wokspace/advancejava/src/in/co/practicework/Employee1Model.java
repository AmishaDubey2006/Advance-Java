package in.co.practicework;

import java.sql.Connection;
import java.sql.DriverManager;											//	(11,"Ruchita",25000,"Marimata",2500,"20/08/2002","362/365",null)
import java.sql.PreparedStatement;

import in.co.rays.marksheet.MarksheetBean;

public class Employee1Model {
	
	public void add (Employee1Bean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement ps = conn.prepareStatement("insert into employee1 values(?,?,?,?,?,?,?,?)");  
		
		ps.setInt(1,bean.getId());
		ps.setString(2,bean.getName());
		ps.setInt(3,bean.getSalary());
		ps.setString(4,bean.getAddress());
		ps.setInt(5,bean.getHr());
		ps.setInt(6,bean.getJoiningdate());
		ps.setInt(7,bean.getPresent());
		ps.setInt(8,bean.getE_id());
		
		int i = ps.executeUpdate();
		System.out.println("Data inserted"+i);
		
	}
	public void update(Employee1Bean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "root");
		PreparedStatement ps = conn.prepareStatement("Update employee1 set id=?, name=?, salary=?, address=?, Hr=?, joiningdate=? present=? e_id=? where id = ?");
		
		ps.setInt(1,bean.getId());
		ps.setString(2,bean.getName());
		ps.setInt(3,bean.getSalary());
		ps.setString(4,bean.getAddress());
		ps.setInt(5,bean.getHr());
		ps.setInt(6,bean.getJoiningdate());
		ps.setInt(7,bean.getPresent());
		ps.setInt(8,bean.getE_id());
		
		int i = ps.executeUpdate();
		System.out.println("Data updated"+i);
	}
	
	public void delete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement ps = conn.prepareStatement("delete from employee1 where id = ?");
		
		ps.setInt(1,id);
		 int i = ps.executeUpdate();
		 System.out.println("Data Deleted"+i);
		 
		
		
		

		
		
		
		
	}

}
