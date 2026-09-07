package day14;

import java.sql.Connection;
import java.sql.Statement;

public class InsertUsingLambdaAndConnectionPoolTryWithResourcesDriverApp2 {

	public static void main(String[] args) {
		
		Thread tx=null;
		
		Runnable thread1=()-> {
			try(
					Connection connection = HikariConnectionPoolMarch2026.getDataSource().getConnection();
					Statement st=connection.createStatement();
				)		
			{
			
			String query="insert into emp values(9,'Rishab', 1000)";
			
			int rows=st.executeUpdate(query);
			
			System.out.println(rows + " records inserted");
			
			}
			catch(Exception ex) {}
			
		};
		
		Runnable thread2=()-> {
			try(
					Connection connection = HikariConnectionPoolMarch2026.getDataSource().getConnection();
					Statement st=connection.createStatement();
				)
			{
			String query="insert into emp values(10,'Hardik', 1000)";
			
			int rows=st.executeUpdate(query);
			
			System.out.println(rows + " records inserted");
			
			}
			catch(Exception ex) {}
			
		};
		
		Runnable thread3=()-> {
			try(
					Connection connection = HikariConnectionPoolMarch2026.getDataSource().getConnection();
					Statement st=connection.createStatement();
				)
			{
			String query="insert into emp values(11,'Surya', 1000)";
			
			int rows=st.executeUpdate(query);
			
			System.out.println(rows + " records inserted");
			
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

