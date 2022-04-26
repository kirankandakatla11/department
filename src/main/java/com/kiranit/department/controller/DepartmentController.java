package com.kiranit.department.controller;

import com.kiranit.department.domain.Department;
import com.kiranit.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/dep")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("save")
    public ResponseEntity saveDepartment(@RequestBody Department department){
        departmentService.saveDepartment(department);
            return ResponseEntity.status(200).body("SUCCESS");
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Department>> getAllDepartment(){
        List<Department> departmentList=departmentService.getAllDepartment();

        return new ResponseEntity<List<Department>>(departmentList,HttpStatus.OK);
    }

}
