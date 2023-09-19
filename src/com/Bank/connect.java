package com.Bank;


import java.sql.*;


public class connect {

	Connection con ;
     Statement s;
	
	connect(){
		
		try{
			  con = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "root");
			   s = con.createStatement();
			    
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
