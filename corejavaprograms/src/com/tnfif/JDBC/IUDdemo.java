package com.tnfif.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class IUDdemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","vishwateja16@");
		Statement st=con.createStatement();
		
	//insert the data
	    String str="insert into student values(1229,'Bharath','IT')";
	    System.out.println("the sql statement "+str);
	    int countno=st.executeUpdate(str);
	    System.out.println(countno +" record inserted");
	    
	    String str1="insert into student values(10,'Sriya','IT')";
	    System.out.println("the sql statement "+str1);
	    int countno1=st.executeUpdate(str1);
	    System.out.println(countno +" record inserted"); 
			
			
	 // delete the data
		
	    String sqldelete="delete from student where stuid=10";
		System.out.println("the sql statement "+sqldelete);
		int countdelte=st.executeUpdate(sqldelete);
		System.out.println(countdelte +" record deleted");
		
	 
	 			
			
		}

	}