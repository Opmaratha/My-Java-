package Java.Itvedant.JDBC;

import java.sql.*;

public class JdbcInsertEx1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/om","root","");
			String sql = "insert into student values(4,'am','com')";
			Statement stm = con.createStatement();
			int rowsAffected= stm.executeUpdate(sql);
			if(rowsAffected>0) {
				System.out.println("Data Inserted");
			}else {
				System.out.println("some error");
			}

			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
