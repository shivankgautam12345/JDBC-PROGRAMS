package com.learning1.JDBCprograms.ex10;
import java.sql.*;
import java.util.*;
public class InsertDynamicMultipleRow {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String url = "jdbc:mysql://localhost:3306/jdbc_database";
       String name = "root";
       
       String password = "Shivank@123";
       Connection con = DriverManager.getConnection(url,name,password);
       System.out.println("Enter the no. of Rows which is to be Inserted:");
       int Rows = sc.nextInt();
       for(int i = 1;i<=Rows;i++) {
       System.out.println("Enter the id:");
       int id = sc.nextInt();
       System.out.println("Enter the name");
       String Name = sc.next();
       System.out.println("Enter the Salary:");
       int salary  = sc.nextInt();
       String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
       
       PreparedStatement pstmt = con.prepareStatement(query);
       pstmt.setInt(1,id);
       pstmt.setString(2,Name);
       pstmt.setInt(3, salary);
       pstmt.executeUpdate();
       }
	}

}
