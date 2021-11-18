package com.dbs.employeemngts.mapper;



import java.sql.ResultSet;
import java.sql.SQLException;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.dbs.employeemngts.dto.Employee;


public class EmployeeRowMapper implements ResultSetExtractor<Employee>,RowMapper<Employee> {



@Override
public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
// TODO Auto-generated method stub
	Employee employee=new Employee();
	employee.setEmpId(rs.getString("empId"));
	employee.setEmpFirstName(rs.getString("empFirstName"));
	employee.setEmpLastName(rs.getString("empLastName"));
	employee.setEmpSalary(rs.getFloat("empSalary"));
	return employee;

}
@Override
public Employee mapRow(ResultSet rs,int  rowNum) throws SQLException{
	return this.extractData(rs);
}
}