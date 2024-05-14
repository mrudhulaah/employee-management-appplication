package com.example.employeemanagementapp.repository;

import com.example.employeemanagementapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
