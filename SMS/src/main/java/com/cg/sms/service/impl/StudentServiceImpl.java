package com.cg.sms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.cg.sms.entity.Student;
import com.cg.sms.exception.StudentNotFoundException;
import com.cg.sms.repository.StudentRepository;
import com.cg.sms.service.StudentService;

@Service("impl1")
@Primary
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public String addStudent(Student student) {
		studentRepository.save(student);
		return "Student added successfully";
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentByRollNumber(Integer rollNumber) throws StudentNotFoundException {
		Optional<Student> studentOpt =  studentRepository.findById(rollNumber);
		if(studentOpt.isPresent()) {
			return studentOpt.get();
		}else {
			throw new StudentNotFoundException("No student found with id : "+rollNumber);
		}
	}

	@Override
	public String deleteStudent(Integer rollNumber) {
		studentRepository.deleteById(rollNumber);
		return "Student is deleted successfully";	
	}

	@Override
	public Student updateStudent(Student updatedStudent) {
		studentRepository.save(updatedStudent);
		return updatedStudent;
	}

	

}
