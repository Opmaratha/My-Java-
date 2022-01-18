package Java.Itvedant.JDBC;

import java.sql.*;
import java.util.Scanner;


public class JdbcViewDataUsingInputFromUser {
	 public static void main(String[] args) {
		 try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/om","root","");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id for which you want to view data");
		int id=sc.nextInt();
		String sql = "select * from student where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
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
