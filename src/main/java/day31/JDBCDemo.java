package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Database connection details
		
		String db_url="jdbc:mysql://localhost:3306";
		String user="root";
		String password="root";
		
		//Step 2: Establish the connection
		
		try {
			Connection connection=DriverManager.getConnection(db_url, user, password);
			
		// Step 3: Check connection is sucessful
			
			if(connection!=null) {
				
				System.out.println("Conection established");
			} else {
				
				System.out.println("Issue in connecting");
			}
			
		// Step 4: Perform operation
			
			// Create the statement
			
			Statement stmt = connection.createStatement();
			
			String createDB="create database db_demo1";
			String use= "use db_demo1";
			String createTable="create table demo_table1 (rno int, firstname varchar(10), marks int)";
			String insert="insert into demo_table1 values (101,'lee',89),(102,'jo',78),(103,'abi',76)";
			String select="select * from demo_table1";
			
			// Execute the statements
			
			stmt.execute(createDB);
			
			stmt.execute(use);
			
			stmt.execute(createTable);
			
			stmt.executeUpdate(insert);
			
			// Selecting the data
			
			ResultSet rs = stmt.executeQuery(select);
			
			// iterate the result
			
			while(rs.next()) {
				
				System.out.println(rs.getInt("rno")+" "+rs.getString("firstname")+" "+rs.getInt("marks"));
				
			}
			
			// Step 5: Close the connection
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
