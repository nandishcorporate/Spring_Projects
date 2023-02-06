package com.cg.sms.service;

import java.util.List;

import com.cg.sms.entity.Department;

public interface DepartmentService {
	
	String addDepartment(Department department);
	List<Department> getAllDepartments();

}
