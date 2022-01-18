package Java.Itvedant.JDBC;
import java.sql.*;
import java.util.Scanner;

public class JdbcInsertDataUsingInputFromUser {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/om","root","");
		Scanner sc=new Scanner(System.in);
		System.out.println("insert the id");
		int id=sc.nextInt();
		System.out.println("insert the name");
		String name=sc.next();
		System.out.println("insert the Stream");
		String Stream=sc.next();
		String sql="insert into student values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,id );
		ps.setString(2, name);
		ps.setString(3, Stream);
		int rowsAffected=ps.executeUpdate();
		if(rowsAffected>0) {
		System.out.println("data inserted");
		}else{
		System.out.println("some error");
		}

		con.close();
		}catch(Exception e){
		e.printStackTrace();

		}

		}

}
