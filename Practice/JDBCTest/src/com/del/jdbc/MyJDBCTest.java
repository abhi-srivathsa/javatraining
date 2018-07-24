package com.del.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJDBCTest {

	public static void main(String[] args) {
		// 1.Add driver jar to library
		try {
			// 2. Load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			// 3. get the connection from database
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kinguser", "king");
			System.out.println("Connection established");
			// 4. Create Statement
			Statement stmt = conn.createStatement();
			// 5.Execute statement
			ResultSet rs = stmt.executeQuery("select * from employee");
			// 6. Iterate over array
			String delim = System.getProperty("line.separator");
			while (rs.next()) {
				System.out.printf("%d %-10s %s %s %-10s"+delim, rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getDate(5));
			//	System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
