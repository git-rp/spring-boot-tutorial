package com.demo.Springboot.tutorial.controller;

import com.demo.Springboot.tutorial.entity.Department;
import com.demo.Springboot.tutorial.service.DepartmentService;
import com.demo.Springboot.tutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return  departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentID){
        return departmentService.fetchDepartmentById(departmentID);
    }
    @DeleteMapping("departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.deleteDepartmentById(departmentId);
    }

    @PutMapping("/departments/{id}")
    public Department udpateDepartment(@PathVariable("id")  Long departmentId,@RequestBody Department department){
         return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/department/name/{name}")
    public Department findDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.findDepartmentByName(departmentName);
    }
}
