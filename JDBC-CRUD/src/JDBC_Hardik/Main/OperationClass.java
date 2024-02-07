package JDBC_Hardik.Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class OperationCass {
	
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	ConnectionCLass ConnectionObject = new ConnectionCLass();
	PreparedStatement psmt;
	public void InsertRecord() throws SQLException, ClassNotFoundException {
		
		 
		
		System.out.println("Enter Student UID: ");
		String UID = sc.next();
		
		System.out.println("Enter Student Name: ");
		String Name = sc.next();
		
		System.out.println("Enter Student Name: ");
		String StudentCourse = sc.next();
		
		System.out.println("Enter Student Batch Year: ");
		String BatchYear = sc.next();
		
		String insertQuery = "insert into student values(?,?,?,?,?)";
		int count =0;
		if(con == null) {
			con = ConnectionObject.getconnection();
			 psmt = con.prepareStatement(insertQuery);
			 count+=1;
			psmt.setInt(1, count);
			psmt.setString(2, UID);
			psmt.setString(3, Name);
			psmt.setString(4, StudentCourse);
			psmt.setString(5, BatchYear);
			int status = psmt.executeUpdate();
			if(status > 0) {
				System.out.println("Record Insert Successfully");
			}
			else {
				System.out.println("No Record Inserted.");	}
	}
		else {
			System.out.println("Connection already established.");
		}
		psmt.close();
		con.close();

}
}
