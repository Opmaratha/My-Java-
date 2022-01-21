package JavaProject.JDBC.SMS.utility;
import java.sql.*;
public final class ConnectionUtil {
	public static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/om","root","");
			return con;
		}catch(Exception e) {
			return null;
		}
	}


}
