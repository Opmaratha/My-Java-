package Java.Itvedant.JDBC.SMS.service;

import Java.Itvedant.JDBC.SMS.model.Student;

public interface StudentService {
	void createStudent(Student s);
	void viewStudent();
	void updateStudent(int id);
	void deleteStudent(int id);

}
