package com.example.backend.service;

import com.example.backend.entity.Employee;
import com.example.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addemployee (Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getallemployeedetails() {
        return employeeRepository.findAll();
    }

    public void deleteemployee(int id){
        employeeRepository.deleteById(id);
    }
}
