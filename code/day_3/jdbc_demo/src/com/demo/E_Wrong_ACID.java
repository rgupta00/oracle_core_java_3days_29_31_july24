package com.demo;

//i want to get all products and print on the console
import java.sql.*;

public class E_Wrong_ACID {

	public static void main(String[] args) {
		// 1. load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. create the connection object
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/busycoder_db", "root", "root");
			
			PreparedStatement pstmt = connection.prepareStatement("update account set balance=balance-10 where id=?");
			pstmt.setInt(1, 1);
			pstmt.executeUpdate();
			
			 pstmt = connection.prepareStatement("update account st balance=balance+10 where id=?");
			pstmt.setInt(1, 2);
			pstmt.executeUpdate();

			System.out.println("fund is transfered");

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
