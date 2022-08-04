import java.sql.*;

public class JDBCTest {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		try
		{
		
		System.out.println("Connecting to the database...");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		
		Statement st = conn.createStatement();
		// For Fetching or Read a data from database
		ResultSet rs = st.executeQuery("SELECT * FROM student");
		
		while(rs.next())
		{
			System.out.println(rs.getInt("ID")+" --> "+rs.getString("NAME"));
		}
		//System.out.println("Connection established!!!");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
