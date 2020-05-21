package com.bihuniak.educator.company;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    private String surname;
    private String position;

    @Embedded
    @Enumerated
    @ManyToOne
    private Department departments;

    public Employee() {
    }

    public Employee(String surname, String position) {
        this.surname = surname;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", surname='" + surname + '\'' +
            ", position='" + position + '\'' +
            '}';
    }
}