package com.learning.JDBCprogramming.ex11;
import java.util.*;
import java.sql.*;
public class AddBatchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/jdbc_database";
        String username = "root";
        String password = "Shivank@123";
        Connection con = null;
        PreparedStatement pstmt = null;
        String query = null;
        Scanner scan  = null;
        int id = 0;
        String name = null;
        int salary  = 0;
        
        
        
        try {
      //Establishing the connection
        con = DriverManager.getConnection(url,username,password);
        System.out.println("Connection is Established");
        query = "insert into Employee values(?,?,?)";
        pstmt = con.prepareStatement(query);
        scan = new Scanner(System.in);
        System.out.println("Enter the no. of rows which is to be Inserted:");
        int rows = sc.nextInt();
        for(int i = 1;i<=rows;i++) {
        	System.out.println("enter the id:");
        	 id  = sc.nextInt();
        	System.out.println("Emter the name");
        	String Name = sc.next();
        	System.out.println("Enter the Salary");
        	salary = sc.nextInt();
        	pstmt.setInt(1,id);
        	pstmt.setString(2, Name);
        	pstmt.setInt(3, salary);
        	pstmt.addBatch();	
        }pstmt.executeBatch();
        System.out.println("Rows are Inserted");
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
