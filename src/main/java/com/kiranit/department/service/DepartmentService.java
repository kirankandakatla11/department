package com.kiranit.department.service;

import com.kiranit.department.domain.Department;

import java.util.List;

public interface DepartmentService {
    public String saveDepartment(Department department);
    public List<Department> getAllDepartment();
}
