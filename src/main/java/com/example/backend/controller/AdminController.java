package com.example.backend.controller;

import com.example.backend.entity.Admin;
import com.example.backend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    //Endpoint to save server
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/addemployee")
    public Admin addadmin(@RequestBody Admin admin){
        System.out.println(admin);
        return adminService.addadmin(admin);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/delete/{id}")
    public String  updateDetails(@PathVariable("id")  Integer k){
        adminService.deleteadmin(k);
        return "deleted";
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/viewadmin")
    public List<Admin> getAllAdmin(){
        return adminService.getalladmindetails();
    }

    //Endpoint to signin user
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/signin")
    public String signin(@RequestBody Admin admin){
        return adminService.signIn(admin.getUsername(), admin.getPassword());
    }


}
