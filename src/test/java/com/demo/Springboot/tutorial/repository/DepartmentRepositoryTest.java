package com.demo.Springboot.tutorial.repository;

import com.demo.Springboot.tutorial.entity.Department;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private TestEntityManager entityManager;
    @BeforeEach
    void setUp() {
        Department department = Department.builder().departmentName("TESt").departmentAddress("Pune").departmentCode("0012").build();
        entityManager.persist(department);
    }
@Test
    public void whenFindById_thenReturnDepartment(){
     Department department = departmentRepository.findById(1l).get();
     assertEquals(department.getDepartmentName(),"TESt");
    }
    @AfterEach
    void tearDown() {
    }
}