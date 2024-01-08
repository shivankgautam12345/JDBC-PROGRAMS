package com.learning.jdbc1.ex8;
import java.util.*;
import java.sql.*;
public class insertDynamicData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      Scanner sc  = new Scanner(System.in);
      //Taking the input for the id,name and the salary.
      System.out.println("Enter the id");
      int id = sc.nextInt();
      System.out.println("Enter the Name:");
      String Name = sc.next();
      System.out.println("Enter the salary");
      int salary = sc.nextInt();
      String url = "jdbc:mysql://localhost:3306/jdbc_database";
      String name = "root";
      String password ="Shivank@123";
      //creating the query to be executed for dynamic data
      //String query ="INSERT INTO  Employee values(?,?,?)";//Placeholder
      String query = "UPDATE Employee set salary = ? where empid = ?";
      Connection con = DriverManager.getConnection(url,name,password);
      System.out.println("Connection is Established");
      PreparedStatement pstmt = con.prepareStatement(query);
     
      //pstmt.setInt(1,id);
     // pstmt.setString(2,Name);
     // pstmt.setInt(3,salary);
      pstmt.setInt(1,84834);
      pstmt.setInt(2,2);
      pstmt.executeUpdate();
      System.out.println("Row is Inserted");
	}

}
