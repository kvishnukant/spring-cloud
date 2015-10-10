package com.employee.project.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.project.Entity.EmployeeEntity;





@Transactional
public interface EmployeeDaoIntr extends CrudRepository<EmployeeEntity, Long>{
	
	

}
