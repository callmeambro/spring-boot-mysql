package com.alfaris.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alfaris.demo.dto.EmployeeDto;
import com.alfaris.demo.entity.Employee;
import com.alfaris.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping
	public List<Employee> getList() {

		return service.list();
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody EmployeeDto dto) {
		return service.create(dto);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody EmployeeDto dto) {
		return service.update(dto);
	}
	
	@DeleteMapping("/delete")
	public Employee deleteEmployee(@RequestParam("id")int id) {
		return service.delete(id);
	}
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id")int id) {
		return service.getById(id);
	}

}
