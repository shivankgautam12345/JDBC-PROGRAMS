package com.learningjdbc.ex12;
import java.sql.*;
import java.util.*;
public class BankUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      String url = "jdbc:mysql://localhost:3306/jdbc_database";
      String username = "root";
      String password = "Shivank@123";
     Scanner scan = null;
      Connection con = null;
      PreparedStatement pstmt1 = null;
      PreparedStatement pstmt2 = null;
      String query1 = null;
      String query2 = null;
      try {
     
       con  = DriverManager.getConnection(url,username,password);
       System.out.println("Connection is Established");
        scan = new Scanner(System.in);
       //Creating the query for increase the amount
       query1 = "UPDATE bank set balance = balance-? where accno = 1";
       //Decrease the amount 
       query2 = "UPDATE bank set balance = balance+? where accno = 3";
      
       System.out.println("Enter the amount to be given");
       int amount  = scan.nextInt();
      
       pstmt1 = con.prepareStatement(query1);
       pstmt1.setInt(1, amount);
      
       //Executing the first Query 
      
       
       pstmt2 = con.prepareStatement(query2);
       pstmt2.setInt(1, amount);
       //Executing the Second Query
       pstmt1.executeUpdate();
       System.out.println("Amount is debited from acc. no == 1");
       pstmt2.executeUpdate();   
       System.out.println("Amount is Credited to acc. no == 3");
	 con.commit();
      }
      catch(Exception e) {
    	  
            e.printStackTrace();
      }finally {
    	  try {
    	  scan.close();
    	  con.close();
    	  pstmt1.close();
    	  pstmt2.close();
     
	}catch(Exception e) {
		e.printStackTrace();
	}
      

}}}
