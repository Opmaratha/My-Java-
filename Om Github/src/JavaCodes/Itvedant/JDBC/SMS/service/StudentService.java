package JavaCodes.Itvedant.JDBC.SMS.service;

import JavaCodes.Itvedant.JDBC.SMS.model.Student;

public interface StudentService {
	void createStudent(Student s);
	void viewStudent();
	void updateStudent(int id);
	void deleteStudent(int id);

}
