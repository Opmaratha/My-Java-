package JavaCodes.Itvedant.JDBC;

import java.sql.*;

public class JdbcDeleteEx1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/om","root","");
			String sql = "delete from student where id=4";
			Statement stm = con.createStatement();
			int rowsAffected= stm.executeUpdate(sql);
			if(rowsAffected>0) {
				System.out.println("Data Deleted");
			}else {
				System.out.println("some error");
			}

			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

