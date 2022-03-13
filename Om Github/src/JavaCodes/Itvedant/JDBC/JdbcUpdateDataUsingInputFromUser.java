package JavaCodes.Itvedant.JDBC;


import java.util.Scanner;
import java.sql.*;


public class JdbcUpdateDataUsingInputFromUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/om","root","");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name and id for which you want to update data");
			String name=sc.next();
			int id = sc.nextInt();
			String sql = "update student set name=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			int rowsAffected= ps.executeUpdate();
			int rs = ps.executeUpdate();
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
