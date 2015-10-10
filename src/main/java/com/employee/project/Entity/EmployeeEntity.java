package com.employee.project.Entity;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;








@Entity
@Table(name="employee")
public class EmployeeEntity {
	
	
	@Id
	private String employeeId;
	
	private String employeeName;
	
	public EmployeeEntity(String employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	

}
