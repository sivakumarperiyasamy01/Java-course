package jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcpractice {

	public static void main(String[] args) throws SQLException {

		Jdbcpractice j1 = new Jdbcpractice();

// jbbc crud operations		

		 j1.insertvalues(); // single data insert
		// j1.addmultipledata(); // create multiple data insert
		//j1.readdata(); // retrieve or read data from table in school database
		// j1.deletedata(); // delete record and update table
		// j1.update(); // change the row value

		//j1.insertusingpst();

	}

	private void insertusingpst() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pass = "siva@123";
		
		int id=101;
		String name="arunkumar";
		int salary=120000;
		String location="tpr";
		
		
		String query = "insert into employee values(?,?,?,?)";
		
		Connection con = DriverManager.getConnection(url, uname, pass);

		PreparedStatement st = con.prepareStatement(query);
		
		st.setInt(1,id);
		st.setString(2,name);
		st.setInt(3,salary);
		st.setString(4,location);
		
		int res=st.executeUpdate();
		System.out.println(res);
		con.close();
		st.close();

	}

	private void update() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pass = "siva@123";
		String query = "update employee set address = 'madurai' where emp_id=78"; // string shuold need to give in
																					// single quote

		// DriverManager looks for a registered JDBC driver that matches the URL prefix
		// (e.g., jdbc:mysql://).
		// It delegates the connection request to the appropriate driver.
		// The driver opens a socket connection to the database server and authenticates
		// using uname and pass.
		// A Connection object (con) that represents an active session with the
		// database.
		// You use this object to send SQL commands and manage transactions.

		Connection con = DriverManager.getConnection(url, uname, pass); //

		Statement st = con.createStatement(); // Prepare to send SQL
		int output = st.executeUpdate(query); // Execute SQL

		System.out.println(output + " row got updated");

		st.close();
		con.close();

	}

	private void deletedata() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pass = "siva@123";
		String query = "delete from employee where emp_id=80";

		Connection con = DriverManager.getConnection(url, uname, pass);

		Statement st = con.createStatement();
		int output = st.executeUpdate(query); // to update

		System.out.println(output + " row got deleted from employee table");

		st.close();
		con.close();
	}

	private void readdata() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String password = "siva@123";
		String query = "select* from employee";

		Connection con = DriverManager.getConnection(url, uname, password); // to make connection it return connection
																			// interface implementing object
		Statement st = con.createStatement();
		ResultSet res = st.executeQuery(query); // it execute the query and it returns an object

		while (res.next()) { // loop through the object and get values from table

			String output = res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3) + " " + res.getString(4);
			System.out.println(output);
		}
		st.close();
		con.close();

	}

	private void addmultipledata() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pass = "siva@123";
		String query = "insert into employee values (80, 'venkat',63840,'goa'),(100, 'sivakumar',638800,'tirunelveli')";

		Connection con = DriverManager.getConnection(url, uname, pass);// Establish the Connection
		Statement st = con.createStatement(); // Create the Statement returns object
		int row = st.executeUpdate(query); // Execute the Query
		System.out.println("no of rows affected " + row);
		st.close();
		con.close();

	}

	private void insertvalues() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/school";
		String uname = "root";
		String pass = "siva@123";
		String query = "insert into employee values (10, 'gow',638721,'chennai')";

		/*
		 * 1.import the package 2.load & register the driver 3.Establish the Connection
		 * 4.Create the Statement 5.Execute the Query 6.Process the Result 7.close
		 * 
		 * 
		 * 
		 * - You call DriverManager.getConnection(...) - It returns an object that
		 * implements the Connection interface - That object is created by the JDBC
		 * driver (e.g., MySQL, PostgreSQL)
		 * 
		 */

		// mysql database connectivtiy jar added - load & register the driver
		// connection interface implement class

		Connection con = DriverManager.getConnection(url, uname, pass);// Establish the Connection
		Statement st = con.createStatement(); // Create the Statement returns object
		int row = st.executeUpdate(query); // Execute the Query
		System.out.println("no of rows affected " + row);
		st.close();
		con.close();

	}

}
