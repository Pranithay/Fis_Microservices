package com.fis.employee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fis.employee.bean.Department;
import com.fis.employee.dao.DepartmentDao;
import com.fis.employee.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Transactional
	public Department findDepartmentById(int id) {
		return departmentRepository.findById(id).get();
	}

	@Autowired
	private DepartmentDao departmentDao;

	public ArrayList<Department> getAllDepartments() {
		return departmentDao.getAllDepartments();
	}

}
