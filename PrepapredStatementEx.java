package com.hpe.jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepapredStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hpe", "root", "rpsconsulting");
		PreparedStatement psmt;
		ResultSet rs;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1.Select Employees between Salaries");
			System.out.println("2.Select Employees by location");
			System.out.println("3.Select Employees by name ends with");
			int option = scan.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the intial salary:");
				int intailSal = scan.nextInt();
				System.out.println("Enter the final salary:");
				int finalSal = scan.nextInt();
				PreparedStatement	psmt1 = conn.prepareStatement("select * from emps where esal between ? and ?");
				psmt1.setInt(1, intailSal);
				psmt1.setInt(2, finalSal);
				rs = psmt1.executeQuery();
				while (rs.next()) {
					System.out.println(
							rs.getInt(1) + " " + rs.getString("ename") + " " + rs.getInt(3) + " " + rs.getString(4));
				}
				break;
			case 2:
				System.out.println("Enter the employe location:");
				String location = scan.next();

				PreparedStatement psmt2 = conn.prepareStatement("select * from emps where eadd =?");
				psmt2.setString(1, location);

				rs = psmt2.executeQuery();
				while (rs.next()) {
					System.out.println(
							rs.getInt(1) + " " + rs.getString("ename") + " " + rs.getInt(3) + " " + rs.getString(4));
				}
				break;
			case 3:
				System.out.println("Enter the employe name eds with:");
				String name = scan.next();

				psmt = conn.prepareStatement("select * from emps");
				rs = psmt.executeQuery();
				while (rs.next()) {
					if (rs.getString(2).endsWith(name)) {
						System.out.println(rs.getInt(1) + " " + rs.getString("ename") + " " + rs.getInt(3) + " "
								+ rs.getString(4));
					}
				}
				break;
			default:

				scan.close();
				conn.close();
				System.exit(0);
			}

		}

	}

}
