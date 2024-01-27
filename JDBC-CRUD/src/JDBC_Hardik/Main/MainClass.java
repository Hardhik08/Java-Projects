package JDBC_Hardik.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class MainClass {
	public static void main(String []args) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cuims","root","");
		
		System.out.println("Connection Established");
		System.out.println(con.getClass().getName());
		System.out.println("Enter 1 for instert record:");
		System.out.println("Enter 2 for Delete record:");
		System.out.println("Enter 3 for Update record:");
		System.out.println("Enter 4 for display_One record:");
		System.out.println("Enter 5 for Display_All record:");
		
		Scanner sc = new Scanner(System.in);
		int reply = sc.nextInt();
		switch (reply)
		{
		case 1:
			OperationCass();
		break;
		case 2:
		break;
		case 3:
		break;
		case 4:
		break;
		case 5:
		break;
		
		default:
			
			System.out.println("Invalid INput.");
		
		}
		
		
	}
    
}
