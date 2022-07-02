package com.example.demo.model;

import com.example.demo.dto.EmployeeDTO;
import lombok.Data;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
// import java.time.LocalDate;

//Map to a database table by name employee
@Entity
//Use to bundle features of getter and setter
@Data

//Created Employee class with different fields
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    // private String lastName;
    private String profilePic;
    @ElementCollection
    @CollectionTable(name = "department", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> department;
    private String salary;
    private String gender;
    private String startDate;
    private String notes;

    public Employee() {
        super();
    }

    public Employee(EmployeeDTO dto) {
        this.name = dto.getName();
        // this.lastName = dto.getLastName();
        this.gender = dto.getGender();
        this.profilePic = dto.getProfilePic();
        this.department = dto.getDepartment();
        this.salary = dto.getSalary();
        this.startDate = dto.getStartDate();
        this.notes = dto.getNotes();
    }

    public Employee(Integer id, EmployeeDTO employeeDTO) {
        super();
        this.id = id;
        this.name = employeeDTO.getName();
        // this.lastName = employeeDTO.getLastName();
        this.profilePic = employeeDTO.getProfilePic();
        this.department = employeeDTO.getDepartment();
        this.gender = employeeDTO.getGender();
        this.salary = employeeDTO.getSalary();
        this.startDate = employeeDTO.getStartDate();
        this.notes = employeeDTO.getNotes();
    }
}
