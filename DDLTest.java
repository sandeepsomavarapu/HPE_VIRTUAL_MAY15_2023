package com.hpe.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDLTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
//		creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hpe", "root", "rpsconsulting");
//		Creating the statement 
		Statement stmt = conn.createStatement();
//		 executing query execute()-->ddl ,executeUpdate()-->dml,executeQuery--->drl
		// stmt.execute("create table emps(eid int,ename varchar(15),esal int,eadd
		// varchar(15))");
		// int result = stmt.executeUpdate("insert into emps
		// values(124,'mahesh',44000,'banglore')");
		// int result = stmt.executeUpdate("update emps set esal=esal+2000 where
		// eid=124");
		int result = stmt.executeUpdate("delete from  emps  where eid=124");
//		 close the connection
		conn.close();
		System.out.println(result + "record updated ....");
	}

}
