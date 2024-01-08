package com.learning.jdbc.ex6;
import java.sql.*;
public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	String url = "jdbc:mysql://localhost:3306/jdbc_database";
        	String name = "root";
        	String password = "Shivank@123";
        	String query = "select * from student10";
        	Connection con  = DriverManager.getConnection(url,name,password);
        	System.out.println("Establishing the connection");
        	Statement stmt = con.createStatement();
        	ResultSet rs = stmt.executeQuery(query);
        	while(rs.next()) {
        		System.out.println(rs.getInt(1)+" "+rs.getString(2));
        	}
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
