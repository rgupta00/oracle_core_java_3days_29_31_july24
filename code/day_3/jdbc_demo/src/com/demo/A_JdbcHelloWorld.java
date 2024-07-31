package com.demo;
//i want to get all products and print on the console
import java.sql.*;

public class A_JdbcHelloWorld {
	
	public static void main(String[] args) {
		//1. load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2. create the connection object
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/busycoder_db", "root", "root")){
			
			//3. featch all the records and print them on console till not finished
			
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			
			while(rs.next()) {
				System.out.println(rs.getInt("id")+": "+ rs.getString("name")+" : "+ rs.getDouble("price"));
			}
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		//4. close the conn ARM
	}

}
