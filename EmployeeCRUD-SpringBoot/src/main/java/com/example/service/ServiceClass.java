package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Employee;
import com.example.dao.DaoClass;

@Service
@Transactional
public class ServiceClass 
{
@Autowired
DaoClass dao;

public Employee EmployeeCreation(Employee emp) {
	return dao.EmployeeCreation(emp);
}

public Employee getEmployeeById(int id) 
{
return dao.getEmployeeById(id);
}

public List<Employee> getAllEmployee() 
{
return dao.getAllEmployee();
}

public Employee delete(int id) 
{
	return dao.deleteById(id);
}

public Employee UpdateEmployee(Employee emp) {
	return dao.UpdateEmployee(emp);	
}

}