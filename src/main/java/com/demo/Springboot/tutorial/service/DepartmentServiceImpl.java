package com.demo.Springboot.tutorial.service;

import com.demo.Springboot.tutorial.entity.Department;
import com.demo.Springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public String deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
        return "deleted";
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Department dob = departmentRepository.findById(id).get();
        if(Objects.nonNull(department.getDepartmentName())
                &&  !"".equalsIgnoreCase(department.getDepartmentName())){
            dob.setDepartmentName(department.getDepartmentName());
        }
        dob.setDepartmentAddress(department.getDepartmentAddress());
        dob.setDepartmentCode(department.getDepartmentCode());
        return departmentRepository.save(dob);
    }

    @Override
    public Department findDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }
}
