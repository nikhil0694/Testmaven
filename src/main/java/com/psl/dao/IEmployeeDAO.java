package com.psl.dao;

import java.util.List;

import com.psl.entity.Employee;

public interface IEmployeeDAO {
	
	public List<Employee> getAllEmployees();
	public void addEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);

}
