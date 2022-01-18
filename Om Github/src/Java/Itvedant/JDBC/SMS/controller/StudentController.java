package Java.Itvedant.JDBC.SMS.controller;

import java.util.Scanner;

import Java.Itvedant.JDBC.SMS.adapter.StudentServiceAdapter;
import Java.Itvedant.JDBC.SMS.model.Student;
import Java.Itvedant.JDBC.SMS.service.StudentService;

public class StudentController {
	static StudentServiceAdapter service=new StudentServiceAdapter();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean systemExit=false;
		while(!systemExit) {
			System.out.println("Select option for which operation you want to perform");
			System.out.println("1. Create Student");
			System.out.println("2. View Student");
			System.out.println("3. Update Student Details");
			System.out.println("4. Delete Student Details");
			System.out.println("5. Exit");


			int action = sc.nextInt();
			switch(action) {
			case 1:
				System.out.println("Enter student name");
				String name = sc.next();
				System.out.println("Enter student stream");
				String stream = sc.next();
				Student s = new Student(name,stream);
				service.createStudent(s);
				break;
			case 2:
				service.viewStudent();
				break;
			case 3:
				System.out.println("Enter the student id to perform update operations");
				int id = sc.nextInt();
				service.updateStudent(id);
				break;
			case 4:
				System.out.println("Enter the student id to perform delete operations");
				int deleteActionId = sc.nextInt();
				service.deleteStudent(deleteActionId);
				break;
			case 5:
				System.exit(0);
				break;
			default :
				System.out.println("Wrong input");
				break;
				
			}
		}

	}

}
