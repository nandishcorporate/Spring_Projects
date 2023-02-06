package com.cg.sms.controller;

import java.rmi.StubNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sms.entity.Student;
import com.cg.sms.service.StudentService;

import jakarta.validation.Valid;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	//@Qualifier("impl2")
	StudentService studentService;
	
	
	//@RequestMapping(value="/students", method = RequestMethod.POST)
	@Validated
	@PostMapping("/students")
	public String addStudent(@RequestBody @Valid Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){		
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/{rollNumber}")
	public Student getStudentByRollNumber(@PathVariable("rollNumber") Integer rollNumber) {		
		return studentService.getStudentByRollNumber(rollNumber);
	}
	
	@GetMapping("/students/byrollnumber")
	public Student getStudentByRollNumberRequestParm(@RequestParam("rollNumber") Integer rollNumber) {		
		return studentService.getStudentByRollNumber(rollNumber);
	}
	
	
	@DeleteMapping("/students/{rollNumber}")
	public String deleteStudent(@PathVariable("rollNumber") Integer rollNumber) {
		return studentService.deleteStudent(rollNumber);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student updatedStudent) {
		return studentService.updateStudent(updatedStudent);
	}
		

}
