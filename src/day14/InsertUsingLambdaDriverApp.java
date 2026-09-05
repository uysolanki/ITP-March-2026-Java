package day14;

import java.sql.Connection;
import java.sql.Statement;

public class InsertUsingLambdaDriverApp {

	public static void main(String[] args) {
		
		Thread tx=null;
		
		
		Runnable thread1=()-> {
			try
			{
			Connection connection = MySqlDBConnectionMarch2026.getConnection();
			
			String query="insert into emp values(6,'Virat', 1000)";
			
			Statement st=connection.createStatement();
			
			int rows=st.executeUpdate(query);
			
			System.out.println(rows + " records inserted");
			
			st.close();
			//connection.close();
			}
			catch(Exception ex) {}
			
		};
		
		Runnable thread2=()-> {
			try
			{
			Connection connection = MySqlDBConnectionMarch2026.getConnection();
			
			String query="insert into emp values(7,'Rohit', 1000)";
			
			Statement st=connection.createStatement();
			
			int rows=st.executeUpdate(query);
			
			System.out.println(rows + " records inserted");
			
			st.close();
			//connection.close();
			}
			catch(Exception ex) {}
			
		};
		
		Runnable thread3=()-> {
			try
			{
			Connection connection = MySqlDBConnectionMarch2026.getConnection();
			
			String query="insert into emp values(8,'Rahul', 1000)";
			
			Statement st=connection.createStatement();
			
			int rows=st.executeUpdate(query);
			
			System.out.println(rows + " records inserted");
			
			st.close();
			//connection.close();
			}
			catch(Exception ex) {}
			
		};
		
		tx=new Thread(thread1);
		tx.start();
		
		tx=new Thread(thread2);
		tx.start();
		
		tx=new Thread(thread3);
		tx.start();
		
		
		
		
	}

}
