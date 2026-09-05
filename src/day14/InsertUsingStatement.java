package day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args)  throws Exception
	{
		
		Connection connection = MySqlDBConnectionMarch2026.getConnection();
		
		String query="insert into emp values(2,'Ben', 900)";
		
		Statement st=connection.createStatement();
		
		int rows=st.executeUpdate(query);
		
		System.out.println(rows + " records inserted");
		
		st.close();
		connection.close();
	}

}
