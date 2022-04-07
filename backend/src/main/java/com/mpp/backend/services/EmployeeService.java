package com.mpp.backend.services;

import com.mpp.backend.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(Long id);
}
