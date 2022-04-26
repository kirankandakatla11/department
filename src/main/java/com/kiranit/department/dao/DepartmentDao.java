package com.kiranit.department.dao;

import com.kiranit.department.domain.Department;
import com.kiranit.department.entity.DepartmentEntity;
import com.kiranit.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DepartmentDao {
    @Autowired
    DepartmentRepository departmentRepository;

    public String saveDepartment(DepartmentEntity departmentEntity) {
        departmentRepository.save(departmentEntity);

        return "SUCCESSDAO";
    }
    public List<DepartmentEntity> getAllDepartment(){
        Iterable<DepartmentEntity> departmentList=departmentRepository.findAll();
        List<DepartmentEntity>   departmentEntities=new ArrayList<>();
           departmentList.forEach(departmentEntity -> departmentEntities.add(departmentEntity));
           return departmentEntities;

    }
}
