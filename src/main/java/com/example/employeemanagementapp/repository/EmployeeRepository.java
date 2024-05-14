package com.example.employeemanagementapp.repository;

import com.example.employeemanagementapp.model.Department;
import com.example.employeemanagementapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
