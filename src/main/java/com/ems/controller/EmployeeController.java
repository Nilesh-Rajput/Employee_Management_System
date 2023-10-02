package com.ems.controller;


//import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Employee;
import com.ems.services.EmployeeService;

@RestController
@RequestMapping(value = "/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		//super();
		this.employeeService = employeeService;
	}
	
	@PostMapping(value = "/employees",consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee createEmployees(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

}
