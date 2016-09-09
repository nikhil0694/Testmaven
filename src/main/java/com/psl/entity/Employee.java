package com.psl.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value(value="1")
	private int id;
	
	@Value(value="Nikhil")
	private String name;
	
/*	@Autowired
	private Address addr;*/
	
	public Employee() {
		//System.out.println("In default constructor of employee");
	}
	public Employee(int id, String name, Address addr) {
		System.out.println("In param constructor of employee");
		this.id = id;
		this.name = name;
	//	this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}*/
	
	public void abc()
	{
		System.out.println("Init abc");
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public void pqr()
	{
		System.out.println("Destroy abc");
	}
	
}
