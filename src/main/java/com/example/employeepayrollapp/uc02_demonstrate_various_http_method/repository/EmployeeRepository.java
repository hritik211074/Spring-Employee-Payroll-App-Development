package com.example.employeepayrollapp.uc02_demonstrate_various_http_method.repository;
import com.example.employeepayrollapp.uc02_demonstrate_various_http_method.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
