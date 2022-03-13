package JavaCodes.Itvedant.JDBC;

import java.sql.*;

public class JdbcUpdateEx1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/om","root","");
			String sql = "update student set name='dabang' where id=4";
			Statement stm = con.createStatement();
			int rowsAffected= stm.executeUpdate(sql);
			if(rowsAffected>0) {
				System.out.println("Data Updated");
			}else {
				System.out.println("some error");
			}

			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

