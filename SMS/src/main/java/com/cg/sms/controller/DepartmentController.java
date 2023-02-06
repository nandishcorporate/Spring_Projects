package com.cg.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sms.entity.Department;
import com.cg.sms.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@Validated
	@PostMapping("/departments")
	public String addDepartment(@RequestBody @Valid Department department) {
		return departmentService.addDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> getAllDeprtments(){
		return departmentService.getAllDepartments();
	}
	
}
