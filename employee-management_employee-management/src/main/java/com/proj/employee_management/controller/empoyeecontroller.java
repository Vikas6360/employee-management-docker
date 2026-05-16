package com.proj.employee_management.controller;


import com.proj.employee_management.entity.emplyee;
import com.proj.employee_management.repository.employeerepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")

public class empoyeecontroller {

    @Autowired
    private employeerepository repository;

    @PostMapping
    public emplyee addEmployee(@RequestBody emplyee employee) {
        return repository.save(employee);
    }

    @GetMapping
    public List<emplyee> getEmployees() {
        return repository.findAll();
    }
}