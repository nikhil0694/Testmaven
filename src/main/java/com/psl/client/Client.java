package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.aop.Performer;
import com.psl.service.EmployeeService;

public class Client {
	
	private static EmployeeService service;

	public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		Client.service = service;
	}

	public static void main(String[] args) throws Exception {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		
//		Employee emp = (Employee)context.getBean("employee");
//		System.out.println(emp.toString());
//		
//	//	System.out.println("In main adding employee");
//	//	service.addEmployee(emp);
//	//	service.updateEmployee(emp);
//	//	service.deleteEmployee(emp);
//		
//		List<Employee> list = service.getAllEmployees();
//		
//		for (Employee employee : list) {
//			System.out.println(employee.toString());
//		}
		Performer p = (Performer)context.getBean("performer");
		p.perform();
	}

}
