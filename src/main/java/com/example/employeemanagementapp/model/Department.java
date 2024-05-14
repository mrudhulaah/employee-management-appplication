package com.example.employeemanagementapp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Department_tbl")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Manager_Id")
    private Long managerId;

    @Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    // Constructors

    public Department() {
    }

    public Department(Long id, String name, Long managerId, String description) {
        this.id = id;
        this.name = name;
        this.managerId = managerId;
        this.description = description;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
