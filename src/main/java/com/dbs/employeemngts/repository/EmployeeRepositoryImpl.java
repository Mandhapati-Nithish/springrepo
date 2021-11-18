package com.dbs.employeemngts.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dbs.employeemngts.dto.Employee;
import com.dbs.employeemngts.mapper.EmployeeRowMapper;
@Repository

public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	
	
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String insertStatement="insert into employee(empId,empFirstName,empLastName,empsalary)"
		+"values(?,?,?,?)";
		int result=jdbcTemplate.update(insertStatement,new Object[] {employee.getEmpId(),employee.getEmpFirstName(),employee.getEmpLastName(),employee.getEmpSalary()},new EmployeeRowMapper());
		
		if(result>0)
			return employee;
		else
			return null;
	}

	@Override
	public Employee deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeeById(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
