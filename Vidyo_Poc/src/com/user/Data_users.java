package com.user;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class Data_users {
	private static  int count=0;
	private static Data_users x=null;
	public static ArrayList userdetails =new ArrayList();
	private Data_users() 
	{
		count++;
	}
	public static Data_users main()
	{
		if(count==0)
		{
			x= new Data_users();
		}
		userdetails.clear();
		return x;
	}
	public void user()
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  //driver registration
			Connection con=(Connection) DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/vidyo","root","");//this are used to establish connection to the database,so never fiddle with this  
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement("select * from list");//helps in creating a statement  
			ResultSet rs=(ResultSet) stmt.executeQuery();  //helps to write a query as the statement is allowed
			while(rs.next()) 
			{
				userdetails.add(rs.getString("uname"));
			}
			con.close();  //to close the connection
			}catch(Exception e){ System.out.println(e);}
		
	}

}
