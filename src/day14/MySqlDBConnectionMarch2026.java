package day14;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDBConnectionMarch2026 {
	
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/itpmarch2026db", "root", ""
		);
		return connection;
	}

}
