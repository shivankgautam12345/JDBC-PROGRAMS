package com.learning.jdbc.ex3;

import java.sql.DriverManager;
import java.sql.*;
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
       String url = "jdbc:mysql://localhost:3306/jdbc_database";
       String name = "root";
       String password = "Shivank@123";
       String query  = "Insert into student10 values(4,'roni'),(5,'sonali'),(6,'jainy')";
       Connection con = DriverManager.getConnection(url,name,password);
       System.out.println("Connection is established");
       Statement stmt = con.createStatement();
       stmt.execute(query);
       
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
