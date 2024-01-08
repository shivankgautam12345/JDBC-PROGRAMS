package com.learning.jdbc.ex1;
import java.sql.*;
import java.util.*;
//1).Import the package
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2).loading the driver
		try {
			String url = "jdbc:mysql://localhost:3306/jdbc_database";
			String password = "Shivank@123";
			String username = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded:");
			
			//3).Establish the Connection.
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection is Established at"+ con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
