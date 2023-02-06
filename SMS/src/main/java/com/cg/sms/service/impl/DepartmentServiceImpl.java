package com.cg.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sms.entity.Department;
import com.cg.sms.repository.DepartmentRepository;
import com.cg.sms.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository deptDepartmentRepository;
	
	
	
	@Override
	public String addDepartment(Department department) {
		deptDepartmentRepository.save(department);
		return "Added department successfully";
	}



	@Override
	public List<Department> getAllDepartments() {
		return deptDepartmentRepository.findAll();
	}

}
