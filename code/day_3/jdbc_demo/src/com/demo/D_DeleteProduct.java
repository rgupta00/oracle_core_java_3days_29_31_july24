package com.demo;

//i want to get all products and print on the console
import java.sql.*;

public class D_DeleteProduct {

	public static void main(String[] args) {
		// 1. load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. create the connection object
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/busycoder_db", "root",
				"root")) {

			PreparedStatement pstmt = connection.prepareStatement("delete from product where id=?");
			pstmt.setInt(1, 5);
			
			pstmt.executeUpdate();

			// 3. add new record to the database
			// Statement vs PreparedStatement vs CallableStatement (I)
			// Statement: have sql injection problem, slow

			// PreparedStatement: fast , no problem of sql injection

			// CallableStatement: SP

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		// 4. close the conn ARM
	}

}
