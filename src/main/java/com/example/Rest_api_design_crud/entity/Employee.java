package com.example.Rest_api_design_crud.entity;


import jakarta.persistence.*;

@Entity
@Table(name ="employee")

public class Employee {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")

    private int id ;

@Column(name = "first_name")
    private String Firstname;

    @Column(name = "last_name")
    private String Lastname;


    @Column(name = "email")
    private String Email;


    public  Employee(){

    }

    public Employee(String firstname, String lastname, String email) {
        Firstname = firstname;
        Lastname = lastname;
        Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
