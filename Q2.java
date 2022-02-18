package javajdbctest;
import DBConnection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q2 {
    	public static void main (String args[]) {
		String dbName = "mydb";
		try {
			Connection con = DBConnection.initialize(dbName);
			String query1 = "SELECT * FROM `Student` WHERE cgpa <10";
			String query2 = " UPDATE `student` SET `cgpa`=10 WHERE name= \"Likith\";";
			
			String query3 = "Select * from Student";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query1);
			
			while(rs.next()) {
				int usn = rs.getInt(1);
				String name = rs.getString(2);
				double cgpa = rs.getDouble(3);
				System.out.println("USN, NAME, CGPA : " + usn + ", " + name + ", " + cgpa);
			}
			
			
		    PreparedStatement ps=con.prepareStatement(query2);
			ps.execute();
			
		    rs = st.executeQuery(query3);
			System.out.println("Updated");
			while(rs.next()) {
				
				int usn = rs.getInt(1);
				String name = rs.getString(2);
				double cgpa = rs.getDouble(3);
				System.out.println("USN, NAME, CGPA : " + usn + ", " + name + ", " + cgpa);
				
			}
					
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
