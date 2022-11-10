package com.demo.Springboot.tutorial.service;

import com.demo.Springboot.tutorial.entity.Department;

import java.util.List;


public interface DepartmentService  {
public Department saveDepartment(Department department);
public List<Department> getAllDepartments();
public Department fetchDepartmentById(Long id);
public String deleteDepartmentById(Long id);
public Department updateDepartment(Long id , Department department);
public Department findDepartmentByName (String departmentName);
}
