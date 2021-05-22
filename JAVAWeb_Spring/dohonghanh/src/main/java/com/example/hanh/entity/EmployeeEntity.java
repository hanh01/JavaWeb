package com.example.hanh.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "wage")
    private int wage;

    public EmployeeEntity() {
    }

    public EmployeeEntity(int id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
