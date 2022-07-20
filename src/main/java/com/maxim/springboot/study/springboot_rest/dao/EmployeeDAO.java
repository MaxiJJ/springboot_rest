package com.maxim.springboot.study.springboot_rest.dao;

import com.maxim.springboot.study.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
