package com.garrison.oa_system.DepartmentManage.dao;

import com.garrison.oa_system.DepartmentManage.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("DepartmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void update(Department department);
    void delete(String sn);
    Department select(String sn);
    List<Department> selectAll();
}
