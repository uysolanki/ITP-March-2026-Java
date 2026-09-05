package day14;

import java.sql.Connection;
import java.sql.Statement;

public class InsertThread1 extends Thread{
	@Override
	public void run() 
	{
		try
		{
		Connection connection = MySqlDBConnectionMarch2026.getConnection();
		
		String query="insert into emp values(3,'Hitesh', 1000)";
		
		Statement st=connection.createStatement();
		
		int rows=st.executeUpdate(query);
		
		System.out.println(rows + " records inserted");
		
		st.close();
		connection.close();
		}
		catch(Exception ex) {}
	}

}
