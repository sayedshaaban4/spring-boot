package com.sayed.springBoot.demo.service;

import com.sayed.springBoot.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartments();

    public Department fetchDepartment(Long departmentId);

    public void deleteDepartment(Long departmentId);
}
