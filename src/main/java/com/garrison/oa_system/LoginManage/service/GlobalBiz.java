package com.garrison.oa_system.LoginManage.service;

import com.garrison.oa_system.EmployeeManagement.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn, String password);
    void changePassword(Employee employee);
}
