package day14;

import java.sql.Connection;
import java.sql.Statement;

public class InsertUsingLambdaAndConnectionPoolDriverApp {

	public static void main(String[] args) {
		
		Thread tx=null;
		
		
		Runnable thread1=()-> {
			try
			{
			Connection connection = HikariConnectionPoolMarch2026.getDataSource().getConnection();
			
			String query="insert into emp values(9,'Rishab', 1000)";
			
			Statement st=connection.createStatement();
			
			int rows=st.executeUpdate(query);
			
			System.out.println(rows + " records inserted");
			
			st.close();
			connection.close();
			}
			catch(Exception ex) {}
			
		};
		
		Runnable thread2=()-> {
			try
			{
			Connection connection = HikariConnectionPoolMarch2026.getDataSource().getConnection();
			
			String query="insert into emp values(10,'Hardik', 1000)";
			
			Statement st=connection.createStatement();
			
			int rows=st.executeUpdate(query);
			
			System.out.println(rows + " records inserted");
			
			st.close();
			connection.close();
			}
			catch(Exception ex) {}
			
		};
		
		Runnable thread3=()-> {
			try
			{
			Connection connection = HikariConnectionPoolMarch2026.getDataSource().getConnection();
			
			String query="insert into emp values(11,'Surya', 1000)";
			
			Statement st=connection.createStatement();
			
			int rows=st.executeUpdate(query);
			
			System.out.println(rows + " records inserted");
			
			st.close();
			connection.close();
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
