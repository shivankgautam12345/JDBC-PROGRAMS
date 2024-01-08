package com.learning.jdbc.ex5;
import java.sql.*;
public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	String url = "jdbc:mysql://localhost:3306/jdbc_database";
        	String name = "root";
        	String password = "Shivank@123";
        	String query = "delete from student10 where ROLLno = 4";
        	Connection con  = DriverManager.getConnection(url,name,password);
        	System.out.println("Connection is Established");
        	Statement stmt = con.createStatement();
        	System.out.println("Creating the statement");
        	stmt.executeUpdate(query);
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
