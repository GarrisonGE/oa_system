package com.garrison.oa_system.EmployeeManagement.service;

import com.garrison.oa_system.EmployeeManagement.dao.EmployeeDao;
import com.garrison.oa_system.EmployeeManagement.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("employeebiz")
public class EmployeeBizImplement implements EmployeeBiz{
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public void add(Employee employee) {
        employee.setPassword(("000000"));
        employeeDao.insert(employee);
    }

    @Override
    public void edit(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void remove(String sn) {
        employeeDao.delete(sn);
    }

    @Override
    public Employee get(String sn) {
        return employeeDao.select(sn);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.selectAll();
    }
}
