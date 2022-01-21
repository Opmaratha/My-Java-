package JavaProject.JDBC.SMS.adapter;

import java.util.Scanner;

import Java.Itvedant.JDBC.SMS.model.Student;
import Java.Itvedant.JDBC.SMS.service.StudentService;
import Java.Itvedant.JDBC.SMS.utility.ConnectionUtil;
import java.sql.*;
public class StudentServiceAdapter implements StudentService {
	public Student[] studentArray = new Student[100];
	int studentCount=1;

	@Override
	public void createStudent(Student s) {
		// TODO Auto-generated method stub
		try {
		s.setId(studentCount);
		String sql="insert into student values(?,?,?)";
		Connection Con = ConnectionUtil.getDBConnection();
		PreparedStatement ps = Con.prepareStatement(sql);
		ps.setInt(1,studentCount );
		ps.setString(2, s.getName());
		ps.setString(3, s.getStream());
		int rowsAffected=ps.executeUpdate();
		if(rowsAffected>0) {
		System.out.println("data inserted");
		}else{
		System.out.println("some error");
		}
		//studentArray[studentCount]=s;
		studentCount++;
		System.out.println("Student added successfully");
			Con.close();
		}catch (Exception e){
			return;
		}

	}

	@Override
	public void viewStudent() {
		// TODO Auto-generated method stub
		try {
		System.out.println("Below are the student details");
		String sql = "select * from student";
		Connection Con = ConnectionUtil.getDBConnection();
		PreparedStatement ps = Con.prepareStatement(sql);
		
		//ps.setInt(1, studentCount);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			
		}
			Con.close();
		}catch(Exception e) {
			return;
		}

	}

	@Override
	public void updateStudent(int id) {
		try {
		// TODO Auto-generated method stub
		boolean flag = false;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter new/old name");
		String name = sc.next();
		System.out.println("Enter new/old stream");
		String stream = sc.next();
		Student s = new Student(id,name,stream);
		String sql = "update student set name=?,stream=? where id =?";
		Connection Con = ConnectionUtil.getDBConnection();
		PreparedStatement ps = Con.prepareStatement(sql);
		ps.setString(1,  s.getName());
		ps.setString(2,  s.getStream());
		ps.setInt(3,s.getId());
		int rowsAffected= ps.executeUpdate();
		int rs = ps.executeUpdate();
		if(rowsAffected>0) {
			System.out.println("Data Updated");
		}else {
			System.out.println("some error");
		}
		if(flag) {
			System.out.println("Successfully updated");
		}
		else {
			System.out.println("Student not found");
		}
			Con.close();
		}
		catch(Exception e) {
			return;
		}
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		try {
			boolean deleteFlag = false;
			String sql = "delete from student where id=?";
			Connection Con = ConnectionUtil.getDBConnection();
			PreparedStatement ps = Con.prepareStatement(sql);
			ps.setInt(1, id);
			int rowsAffected = ps.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Data Deleted");
			} else {
				System.out.println("some error");
			}
			if (deleteFlag) {
				System.out.println("Success");
			} else {
				System.out.println("not Success");
			}
			Con.close();
		}catch(Exception e){
			return;
		}


	}

}
