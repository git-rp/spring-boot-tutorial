package com.demo.Springboot.tutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deptId;

    private String departmentAddress;
    private String departmentCode;
    @NotBlank(message = "Please Add Department Name ")
    private String departmentName;

    /* public Department(long deptId, String departmentName, String departmentAddress, String departmentCode) {
         this.deptId = deptId;
         this.departmentName = departmentName;
         this.departmentAddress = departmentAddress;
         this.departmentCode = departmentCode;
     }

     public Department() {
     }

     public long getDeptId() {
         return deptId;
     }

     public void setDeptId(long deptId) {
         this.deptId = deptId;
     }

     public String getDepartmentName() {
         return departmentName;
     }

     public void setDepartmentName(String departmentName) {
         this.departmentName = departmentName;
     }

     public String getDepartmentAddress() {
         return departmentAddress;
     }

     public void setDepartmentAddress(String departmentAddress) {
         this.departmentAddress = departmentAddress;
     }

     public String getDepartmentCode() {
         return departmentCode;
     }

     public void setDepartmentCode(String departmentCode) {
         this.departmentCode = departmentCode;
     }*/
    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
