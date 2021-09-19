package com.example.backend.service;

import com.example.backend.entity.Admin;
import com.example.backend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin addadmin (Admin admin){
        return adminRepository.save(admin);
    }

    public List<Admin> getalladmindetails() {
        return adminRepository.findAll();
    }

    public void deleteadmin(int id){
        adminRepository.deleteById(id);
    }

    public String signIn(String username, String password){
        Admin k = adminRepository.findByUsernameAndPassword(username,password);
        if(k!=null){
            return String.valueOf(k.getAdminID());
        } else{
            return "Okay";
        }
    }
}