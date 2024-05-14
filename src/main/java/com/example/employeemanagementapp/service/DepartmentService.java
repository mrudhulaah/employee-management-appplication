package com.example.employeemanagementapp.service;

import com.example.employeemanagementapp.model.Department;
import com.example.employeemanagementapp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    // Method to retrieve all departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Method to retrieve a department by ID
    public Department getDepartmentById(Long id) {
        Optional<Department> departmentOptional = departmentRepository.findById(id);
        return departmentOptional.orElse(null);
    }

    // Method to create a new department
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Method to update an existing department
    public Department updateDepartment(Long id, Department department) {
        Optional<Department> existingDepartmentOptional = departmentRepository.findById(id);
        if (existingDepartmentOptional.isPresent()) {
            Department existingDepartment = existingDepartmentOptional.get();
            existingDepartment.setName(department.getName());
            existingDepartment.setDescription(department.getDescription());
            return departmentRepository.save(existingDepartment);
        } else {
            return null;
        }
    }

    // Method to delete a department by ID
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }


}