package com.example.backend.controller;

import com.example.backend.entity.Employee;
import com.example.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //Endpoint to save server
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/addemployee")
    public Employee adduser(@RequestBody Employee employee){
        System.out.println(employee);
        return employeeService.addemployee(employee);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/delete/{id}")
    public String  deleteemployee(@PathVariable("id")  Integer k){
        employeeService.deleteemployee(k);
        return "deleted";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/viewemployee")
    public List<Employee> getAllEmployees(){
        return employeeService.getallemployeedetails();
    }

}
