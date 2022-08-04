import java.sql.*;

public class CRUDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		
		// 1st Method not suggestible Using Statement
		//Statement st = conn.createStatement();
		
		// For Creating a Table
		//int n = st.executeUpdate("CREATE TABLE employee(emp_id int, emp_name varchar2(30), emp_salary int)");
		
		// For Insert a Data in Table
		//int n = st.executeUpdate("INSERT INTO employee values(103,'employeeC',7000)");
		//int n = st.executeUpdate("INSERT INTO employee(emp_id,emp_name) values(104,'employeeD')");
		
		// For Updating a Data in Table
		//int n = st.executeUpdate("UPDATE employee SET emp_salary = 11000 where emp_id = 104");
		//int n = st.executeUpdate("UPDATE employee SET emp_salary = 5000 where emp_salary > 1000");
		
		// For Deleting a Data in Table
		//int n = st.executeUpdate("DELETE FROM employee where emp_id = 104");
		//int n = st.executeUpdate("DELETE FROM employee");
		
		// 2nd Method suggestible Using PreparedStatement
		
		// For Inserting a Data in Table
		//PreparedStatement ps = conn.prepareStatement("INSERT INTO employee values(?,?,?)");
		//ps.setInt(1, 103);
		//ps.setString(2, "employeeC");
		//ps.setInt(3, 10000);
		//int n = ps.executeUpdate();
		
		// For Updating a Data in Table
		//PreparedStatement ps = conn.prepareStatement("UPDATE employee SET emp_salary = ? where emp_id = ?");
		//ps.setInt(1, 20000);
		//ps.setInt(2, 102);
		//int n = ps.executeUpdate();
		
		// For Deleting a Data in Table
		//PreparedStatement ps = conn.prepareStatement("DELETE FROM employee where emp_id = ?");
		//ps.setInt(1, 103);
		PreparedStatement ps = conn.prepareStatement("DELETE FROM employee where emp_salary >= ?");
		ps.setInt(1, 1000);
		
		int n = ps.executeUpdate();
		System.out.println("Number of rows affected: "+n);
		
		conn.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
