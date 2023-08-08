package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModel {
	public void add (MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?)");
	
	ps.setInt(1,bean.getId());
	ps.setString(2,bean.getName());
	ps.setInt(3,bean.getRollNo());
	ps.setInt(4,bean.getPhysics());
	ps.setInt(5,bean.getChemistry());
	ps.setInt(6,bean.getMaths());
	ps.setInt(7,bean.getPractical());

	int i = ps.executeUpdate();
	System.out.println("Data inserted"+i);
	}
	
	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "root");
		PreparedStatement ps = conn.prepareStatement("Update marksheet set name=?, roll_no=?, physics=?, chemistry=?, maths=?, practical=? where id=?");
		
		ps.setString(1,bean.getName());
		ps.setInt(2,bean.getRollNo());
		ps.setInt(3,bean.getPhysics());
		ps.setInt(4,bean.getChemistry());
		ps.setInt(5,bean.getMaths());
		ps.setInt(6,bean.getPractical());
		ps.setInt(7, bean.getId());
		
		int i = ps.executeUpdate();
		System.out.println("Data updated"+i);
	}
	
	public void delete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");
		
		ps.setInt(1,id);
		 int i = ps.executeUpdate();
		 System.out.println("Data Deleted"+i);
		 
		
		
		
		
		
		
		
		
	}
	}