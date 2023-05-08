import java.sql.*;
public class Demo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish connection to the database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc352", "root", "root123");
		System.out.println("Connection Established!!");
		
		//Generate the connection object
		Statement st=con.createStatement();
		
		//Fire the query and collect the records in the ResultSet
		ResultSet rs=st.executeQuery("select empName from employee");
		while(rs.next())
				//rs.getXxx(int), rs.getXxx(string)
				System.out.println(rs.getString(1));			
	}

}
