package com.demo.Springboot.tutorial.service;

import com.demo.Springboot.tutorial.entity.Department;
import com.demo.Springboot.tutorial.repository.DepartmentRepository;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeAll
    void setUp() {
        Department department = Department.builder().departmentName("IT").departmentAddress("Pune").departmentCode("IT-06").deptId(1l).build();
        Mockito.when(departmentRepository.findByDepartmentName("IT")).thenReturn(department);
    }
    @Test
    @DisplayName("Get Data based on department name")
    public void whenValidDepartmentName_thenDepartmentShouldbeFound(){
        String departmentName= "IT";
        Department found = departmentService.findDepartmentByName(departmentName);
        assertEquals(departmentName,found.getDepartmentName());

    }
}