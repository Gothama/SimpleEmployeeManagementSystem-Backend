package com.example.backend.entity;


import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin  {

    @Id
    @GeneratedValue
    private int adminID;
    private String name;
    private String password;
    private String username;
    private String position;
    private String telephoneNumber;

    public Admin() {

    }

    public Admin(int adminID, String name, String password, String username, String position, String telephoneNumber) {
        this.adminID = adminID;
        this.name = name;
        this.password = password;
        this.username = username;
        this.position = position;
        this.telephoneNumber = telephoneNumber;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}