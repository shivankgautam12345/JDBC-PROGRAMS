package com.learning.jdbc.ex4;
import java.sql.*;
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   String url = "jdbc:mysql://localhost:3306/jdbc_database";
    	   String name = "root";
    	   String password = "Shivank@123";
    	   String query = "update student10 set Name = 'tish' where ROLLno = 4";
    	   Connection con  = DriverManager.getConnection(url,name,password);
    	   System.out.println("Establishing the connection");
    	   Statement stmt =  con.createStatement();
    	   stmt.executeUpdate(query);
    	   
       }catch(Exception e) {
    	   e.printStackTrace();
    	   
    	   
       }
	
	}

}
