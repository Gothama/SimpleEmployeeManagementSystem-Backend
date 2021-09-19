package com.example.backend.entity;


import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee  {

    @Id
    @GeneratedValue
    private int employeeID;
    private String name;
    private String nic;
    private String salary;
    private String addeddate;
    private String position;
    private String telephoneNumber;

    public Employee() {
    }

    public Employee(int employeeID, String name, String nic, String salary, String addeddate, String position, String telephoneNumber) {
        this.employeeID = employeeID;
        this.name = name;
        this.nic = nic;
        this.salary = salary;
        this.addeddate = addeddate;
        this.position = position;
        this.telephoneNumber = telephoneNumber;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAddeddate() {
        return addeddate;
    }

    public void setAddeddate(String addeddate) {
        this.addeddate = addeddate;
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