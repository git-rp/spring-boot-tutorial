package com.demo.Springboot.tutorial.controller;

import com.demo.Springboot.tutorial.entity.Department;
import com.demo.Springboot.tutorial.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.client.MockMvcClientHttpRequestFactory;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;
    @BeforeEach
    void setUp() {
        department =Department.builder().departmentCode("001").departmentName("test").departmentAddress("Test").deptId(1l).build();

    }

    @Test
    void saveDepartment() {
        Department inputdepartment =Department.builder().departmentCode("001").departmentName("test").departmentAddress("Test").build();
        Mockito.when(departmentService.saveDepartment(inputdepartment)).thenReturn(department);



    }

    @Test
    void fetchDepartmentById() {
    }

    @Test
    void findDepartmentByName() {
    }
}