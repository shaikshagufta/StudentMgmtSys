package dxc.b2.thyme.services;

import java.util.List;

import dxc.b2.thyme.entity.Student;

public interface StudentService
{
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);
}