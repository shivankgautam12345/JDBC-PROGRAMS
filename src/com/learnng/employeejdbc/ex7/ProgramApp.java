package com.learnng.employeejdbc.ex7;
import java.util.*;
import java.sql.*;
public class ProgramApp {
    public static void insert(Statement stmt) throws Exception {
    	
         String query = "Insert into Employee values(1,'soni',4323),(2,'gautam',834998),(3,'ronak',8358934)";
         stmt.executeUpdate(query);
         System.out.println("Data is Inserted");
    }
public static void update(Statement stmt) throws Exception {
	
    String query = "Update  Employee set salary = 65000 where empid = 3";
    System.out.println("Data is Updated");
    }
public static void delete(Statement stmt) throws Exception {
	
    String query = "delete from  Employee where empid = 3";
    stmt.executeUpdate(query);
    System.out.println("Data is Deleted");
}
public static  void select(Statement stmt) throws Exception {
	
    String query = "select * from Employee";   
     ResultSet rs  = stmt.executeQuery(query);
     while(rs.next()) {
    	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
     }
    System.out.println("Data is Updated");
}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/jdbc_database";
	    String name = "root";
	    String password = "Shivank@123";
	    Connection con = DriverManager.getConnection(url,name,password);	
	    System.out.println("Connection Established");
	    Statement stmt = con.createStatement();
		
		
		
		while(true) {
			System.out.println("Enter 1 for Insert,2 for update,3 for delete and 4 for select");
			int choice = sc.nextInt();
		if(choice == 1) {
		insert(stmt);
		}
		else if(choice==2) {
		update(stmt);
		}
		else if(choice ==3) {
		delete(stmt);
		}
		else if(choice==4) {
		select(stmt);
		}else {System.out.println("ok Thanks");
		System.exit(0);}
		}
	}

}
