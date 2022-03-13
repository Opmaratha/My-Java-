package JavaCodes.Itvedant.JDBC;

//code to get output from database using jdbc
import java.sql.*;

public class JdbcStatementEx1 {
 public static void main(String[] args) {
	 try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/om","root","");
	Statement stm = con.createStatement();
	String sql = "select * from student";
	ResultSet rs = stm.executeQuery(sql);
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		
	}
	 
	con.close();
	 }catch(Exception e){
		 e.printStackTrace();
	 }
}
}
