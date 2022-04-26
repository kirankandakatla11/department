package com.kiranit.department.service;

import com.kiranit.department.dao.DepartmentDao;
import com.kiranit.department.domain.Department;
import com.kiranit.department.entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentDao departmentDao;

    public String saveDepartment(Department department){
        DepartmentEntity departmentEntity=new DepartmentEntity();
        departmentEntity.setDepId(department.getDepId());
        departmentEntity.setFirstName(department.getFirstName());
        departmentEntity.setLastName(department.getLastName());
        departmentEntity.setAddress(department.getAddress());
        departmentDao.saveDepartment(departmentEntity);

        return "successService";
    }

    public List<Department> getAllDepartment(){
        List<Department> departmentList=new ArrayList<>();
        List<DepartmentEntity> departmentEntities=departmentDao.getAllDepartment();
        for(DepartmentEntity departmentEntity:departmentEntities){
            Department department=new Department();
            department.setDepId(departmentEntity.getDepId());
            department.setFirstName(departmentEntity.getFirstName());
            department.setLastName(departmentEntity.getLastName());
            department.setAddress(departmentEntity.getAddress());
            departmentList.add(department);
        }
        return departmentList;
    }

}
