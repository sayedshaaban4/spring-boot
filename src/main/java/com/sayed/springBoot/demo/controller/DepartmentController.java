package com.sayed.springBoot.demo.controller;

import com.sayed.springBoot.demo.entity.Department;
import com.sayed.springBoot.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartments() {

        return departmentService.fetchDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartment(@PathVariable("id") Long departmentId) {
        return departmentService.fetchDepartment(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartment (@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartment(departmentId);
        return "Department deleted successfully :)";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment (@PathVariable("id") Long departmentId ,
                                        @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId,department);
    }
}
