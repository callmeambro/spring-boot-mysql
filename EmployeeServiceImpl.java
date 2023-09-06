package com.alfaris.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfaris.demo.dto.EmployeeDto;
import com.alfaris.demo.entity.Employee;
import com.alfaris.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo repo;

	@Override
	public List<Employee> list() {

		return repo.findAll();
	}

	@Override
	public Employee create(EmployeeDto dto) {
		Employee emp = new Employee();
		BeanUtils.copyProperties(dto, emp);
		return repo.save(emp);
	}

	@Override
	public Employee update(EmployeeDto dto) {
		
		Optional<Employee> opt=repo.findById(dto.getId());
		if(opt.isPresent()) {
			Employee emp=opt.get();
			BeanUtils.copyProperties(dto, emp);
			return repo.save(emp);
		}
		return null;
	}

	@Override
	public Employee delete(int id) {
		Employee emp= new Employee();
		Optional<Employee> opt=repo.findById(id);
		if(opt.isPresent()) {
			emp=opt.get();
			repo.deleteById(id);
			
			return emp;
		}
		return null;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> opt= repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}
