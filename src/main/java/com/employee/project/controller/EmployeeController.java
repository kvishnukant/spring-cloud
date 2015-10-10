package com.employee.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.project.Dao.EmployeeDaoIntr;
import com.employee.project.Entity.EmployeeEntity;
import com.employee.project.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDaoIntr employeeService;
	
	@RequestMapping("/")
    String home() {
        return "Employee Management System";
    }
	
	
	@RequestMapping("/create")
    String check() {
		
        return "check World!";
    }
	
	
	@RequestMapping("/createdata")
	  @ResponseBody
	  public String create(String employeeId, String employeeName) {
	    EmployeeEntity emp = null;
	    try {
	      emp = new EmployeeEntity(employeeId, employeeName);
	      employeeService.save(emp);
	      
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created! (id = " + emp.getEmployeeId() + ")";
	  }
	  

}
