package com.example.CrudDemoTest1.repository;

import com.example.CrudDemoTest1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
