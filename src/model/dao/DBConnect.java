package model.dao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=FPT";
	static String userName = "sa";
	static String password = "12345678";
	static Connection connection;

	public static Connection getConnect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
//			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
//			System.out.println("Ket noi loi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
//			System.out.println("Ket noi loi");
		}
		return connection;
	}

}
