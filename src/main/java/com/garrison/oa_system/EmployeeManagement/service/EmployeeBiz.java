package com.garrison.oa_system.EmployeeManagement.service;

import com.garrison.oa_system.EmployeeManagement.entity.Employee;

import java.util.List;

public interface EmployeeBiz {
    void add(Employee employee);
    void edit(Employee employee);
    void remove(String sn);
    Employee get(String sn);
    List<Employee> getAll();
}
