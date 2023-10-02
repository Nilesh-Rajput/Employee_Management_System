package com.ems.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ems.entity.EmployeeEntity;
import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;



@Service
public class EmployeeServiceimpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
		//super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		
		BeanUtils.copyProperties(employee, employeeEntity);
		employeeRepository.save(employeeEntity);
		return employee;
	}

}
