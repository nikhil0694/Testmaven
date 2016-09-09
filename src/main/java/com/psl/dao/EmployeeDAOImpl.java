package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.psl.entity.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return template.query("SELECT * FROM employee",new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				return e;
			}
			
		});
	}

	@Override
	public void addEmployee(Employee e) {

		System.out.println("In DAO addEmployee");
		template.update("INSERT INTO employee (id, name) VALUES (" + e.getId()+",'"+e.getName()+"')");
	}

	@Override
	public void updateEmployee(Employee e) {

		template.update("UPDATE employee SET email='nikhil_jaywant@persistent.com' WHERE name='"+e.getName()+"'");
	}

	@Override
	public void deleteEmployee(Employee e) {
		System.out.println("delete employee record");
		template.execute("DELETE FROM employee WHERE id="+e.getId());
	}

}
