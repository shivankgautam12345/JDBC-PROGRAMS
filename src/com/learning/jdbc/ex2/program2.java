package com.learning.jdbc.ex2;
import java.util.*;
import java.sql.*;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	String url = "jdbc:mysql://localhost:3306/jdbc_database";
    	String name = "root";
    	String password = "Shivank@123";
    	String query = "CREATE TABLE STUDENT10(RollNo int ,Name VARCHAR(10))";
       //Loading the Driver
    	//Class.forName("com.mysql.cj.jdbc.Driver");
       // System.out.println("Driver is loaded");
       //Establishing the connection 
        Connection con =  DriverManager.getConnection(url,name,password) ;
        System.out.println("Connetion is established");
        //Creating the Statement using connection
        Statement stmt = con.createStatement();
        //Executing the Query using statement
        stmt.execute(query);
        System.out.println("Query is Executed");	
    }catch(Exception e){
		e.printStackTrace();
	}
	}

}
