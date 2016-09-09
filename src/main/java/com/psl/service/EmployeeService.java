package com.psl.service;

import java.util.List;

import com.psl.dao.IEmployeeDAO;
import com.psl.entity.Employee;

public class EmployeeService {
	
	private IEmployeeDAO dao;
	
	public IEmployeeDAO getDao() {
		return dao;
	}

	public void setDao(IEmployeeDAO dao) {
		this.dao = dao;
	}

	public List<Employee> getAllEmployees(){
		return dao.getAllEmployees();
	}
	
	public void addEmployee(Employee e){
		System.out.println("In Service addEmployee");
		dao.addEmployee(e);
	}
	
	public void updateEmployee(Employee e){
		dao.updateEmployee(e);
	}
	
	public void deleteEmployee(Employee e){
		dao.deleteEmployee(e);
	}

}
