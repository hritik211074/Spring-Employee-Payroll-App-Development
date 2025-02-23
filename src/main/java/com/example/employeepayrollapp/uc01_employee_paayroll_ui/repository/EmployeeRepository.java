package com.example.employeepayrollapp.uc01_employee_paayroll_ui.repository;

import com.example.employeepayrollapp.uc01_employee_paayroll_ui.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
