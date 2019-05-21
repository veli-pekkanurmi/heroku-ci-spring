package dev.nurmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.nurmi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
