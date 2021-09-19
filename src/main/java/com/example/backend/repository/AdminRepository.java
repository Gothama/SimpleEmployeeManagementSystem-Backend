package com.example.backend.repository;

import com.example.backend.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository <Admin, Integer>{

    void deleteByAdminID(int id);

    Admin findByUsernameAndPassword(String username, String password);
}
