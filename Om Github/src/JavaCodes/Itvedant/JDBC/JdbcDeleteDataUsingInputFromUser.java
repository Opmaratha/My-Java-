package JavaCodes.Itvedant.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDeleteDataUsingInputFromUser {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/om","root","");
            Scanner sc=new Scanner(System.in);
            System.out.println("insert the id for which you want to delete the Student");
            int id=sc.nextInt();
            String sql = "delete from student where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            int rowsAffected=ps.executeUpdate();
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
