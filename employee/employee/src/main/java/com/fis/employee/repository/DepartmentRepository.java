package com.fis.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.employee.bean.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
