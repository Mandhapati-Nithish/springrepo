package com.dbs.employeemngts;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dbs.employeemngts.config.Config;
import com.dbs.employeemngts.repository.EmployeeRepository;
import com.dbs.employeemngts.service.EmployeeService;


public class Main {



public static void main(String[] args) {
// TODO Auto-generated method stub
ApplicationContext applicationContext=
new AnnotationConfigApplicationContext(Config.class);
//above line informs that we are using java based annotation strategy
//to create spring environment

EmployeeService employeeService=applicationContext.getBean(EmployeeService.class);
EmployeeService employeeService2=applicationContext.getBean(EmployeeService.class);

System.out.println(employeeService.hashCode());
System.out.println(employeeService2.hashCode());
System.out.println(employeeService.equals(employeeService2));
System.out.println(employeeService==employeeService2);


BasicDataSource basicDataSource=applicationContext.getBean("datasource",BasicDataSource.class);

BasicDataSource basicDataSource2=applicationContext.getBean("datasource",BasicDataSource.class);

System.out.println(basicDataSource==basicDataSource2);

}

}