package com.garrison.oa_system.DepartmentManage.service;

import com.garrison.oa_system.DepartmentManage.dao.DepartmentDao;
import com.garrison.oa_system.DepartmentManage.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentBizImplement implements DepartmentBiz{
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public void add(Department department) {
        departmentDao.insert(department);
    }

    @Override
    public void edit(Department department) {
        departmentDao.update(department);
    }

    @Override
    public void remove(String sn) {
        departmentDao.delete(sn);
    }

    @Override
    public Department get(String sn) {

        return departmentDao.select(sn);
    }

    @Override
    public List<Department> getAll() {
        return departmentDao.selectAll();
    }
}
