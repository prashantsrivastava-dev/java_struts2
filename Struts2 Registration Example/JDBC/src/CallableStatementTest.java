import java.sql.*;

public class CallableStatementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
		
//		    CallableStatement stmt=conn.prepareCall("{call insertEmployee(?,?,?)}");
//		    stmt.setInt(1, 101);
//		    stmt.setString(2, "employeeA");
//		    stmt.setInt(3, 9000);
//		    
//		    int n = stmt.executeUpdate();
//		    System.out.println("Number of rows affected: "+n);
		
			CallableStatement st =conn.prepareCall("{call getEmployeeById(?,?,?)}");
		    st.setInt(1, 101);
		    st.registerOutParameter(2, java.sql.Types.VARCHAR);
		    st.registerOutParameter(3, java.sql.Types.INTEGER);
		    
		    st.executeUpdate();
		    System.out.println("Name: "+st.getString(2)+" SALARY: "+st.getInt(3));
		    
            conn.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
