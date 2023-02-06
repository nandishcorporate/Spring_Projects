package com.cg.sms.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.sms.entity.Department;
import com.cg.sms.entity.Student;
import com.cg.sms.repository.StudentRepository;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
	
	@Mock
	private StudentRepository studentRepository;
	
	@InjectMocks
	StudentServiceImpl studentService;
	
	@Test
	@DisplayName("Add Student")
	void addStudentTest(){
		Student student = createStudentMockData();
	    when(studentRepository.save(student)).thenReturn(student);	
		String response = studentService.addStudent(student);
		assertEquals(response, "Student added successfully");
	}
	
	@Test
	@DisplayName("Get All Students")
	void getAllStudentsTest() {
		List<Student> students = new ArrayList<>();
		students.add(createStudentMockData());
		when(studentRepository.findAll()).thenReturn(students);
		List<Student> allStudents = studentService.getAllStudents();
		assertNotNull(allStudents);
		assertEquals(allStudents.size(), 1);
		
	}
	
	@Test
	@DisplayName("Get Student By RollNumber")
	void getStudentByRollNumber() {
		int rollNumber = 2;
		Student student = createStudentMockData();
		when(studentRepository.findById(rollNumber)).thenReturn(Optional.of(student));
		Student response = studentService.getStudentByRollNumber(rollNumber);
		assertEquals(response.getName(), student.getName());
	}
	
	@Test
	@DisplayName("Delete Student")
	void deleteStudentTest() {
		int rollNumber = 2;
		doNothing().when(studentRepository).deleteById(rollNumber);
		String response = studentService.deleteStudent(rollNumber);
		assertEquals(response, "Student is deleted successfully");
	}
	
	@Test
	@DisplayName("Update Student")
	void updateStudentTest() {
		Student student = createStudentMockData();
		when(studentRepository.save(student)).thenReturn(student);
		Student response = studentService.updateStudent(student);
		assertEquals(response.getName(), student.getName());
	}
	
	
	private Student createStudentMockData() {
		Student student = new Student();
		student.setName("Umesh");
		student.setEmail("umesh@gmail.com");
		student.setDepartment(createMockDepartment(2));
		return student;
	}
	
	private Department createMockDepartment(long id) {
		Department dept = new Department();
		dept.setId(id);
		return dept;
	}

}
