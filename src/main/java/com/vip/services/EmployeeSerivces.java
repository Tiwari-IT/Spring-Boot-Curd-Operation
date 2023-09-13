package com.vip.services;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.vip.entity.Employee;
import com.vip.exceptionhander.ResourceNotFoundException;

public interface EmployeeSerivces {

	public List<Employee> findAllEmployee();

	public ResponseEntity<Employee> findId(Long id) throws ResourceNotFoundException;

	public Employee saveEmployee(Employee emp);

	public ResponseEntity<Employee> updateEmployeeByID(Long id, Employee emp) throws ResourceNotFoundException;

	public Map<String, Boolean> deleteEmployeeByID(Long id) throws ResourceNotFoundException;

}
