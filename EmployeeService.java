package com.alfaris.demo.service;

import java.util.List;

import com.alfaris.demo.dto.EmployeeDto;
import com.alfaris.demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> list();
	public Employee create(EmployeeDto dto);
	public Employee update(EmployeeDto dto);
	public Employee delete(int id);
	public Employee getById(int id);

}
