package com.dnyanesh.springdatasolr.controller;

import com.dnyanesh.springdatasolr.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    public void insertRecords(){

    }

    @GetMapping("/all")
    public List<Employee> getEmployees(){
        return null;
    }
}
