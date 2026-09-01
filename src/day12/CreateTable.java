package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args)  throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		Connection connection = DriverManager.getConnection(
		    "jdbc:mysql://localhost:3306/itpmarch2026db", "root", ""
		);
		
		
		String query="create table emp(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(10) not null,\r\n"
				+ "sal numeric(7,2))";
		
		Statement st=connection.createStatement();
		
		st.execute(query);
		
		st.close();
		connection.close();
		

	}

}
