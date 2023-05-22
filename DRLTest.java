package com.hpe.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
//		creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hpe", "root", "rpsconsulting");
//		Creating the statement 
		Statement stmt = conn.createStatement();
//		 executing query execute()-->ddl ,executeUpdate()-->dml,executeQuery--->drl
		ResultSet rs = stmt.executeQuery("select * from emps");
				
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString("ename")+" "+ rs.getInt(3)+" "+rs.getString(4));
		}
		
//		 close the connection
		conn.close();
		
	}

}
