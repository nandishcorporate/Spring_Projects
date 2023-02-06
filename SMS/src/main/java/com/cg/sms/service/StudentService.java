package com.cg.sms.service;

import java.util.List;

import com.cg.sms.entity.Student;
import com.cg.sms.exception.StudentNotFoundException;

public interface StudentService {	
	String addStudent(Student student);
	List<Student> getAllStudents();
	Student getStudentByRollNumber(Integer rollNumber) throws StudentNotFoundException;
	String deleteStudent(Integer rollNumber);
	Student updateStudent(Student updatedStudent);
}
