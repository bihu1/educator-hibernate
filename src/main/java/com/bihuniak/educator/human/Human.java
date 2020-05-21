package com.bihuniak.educator.human;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Human {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    @Enumerated(value = EnumType.STRING)
    private Sex sex;
    private LocalDate birthday;

    @ElementCollection
    private List<Address> addresses;

    @ElementCollection
    private List<String> phones = new ArrayList<>();

    public Human() {
    }

    public Human(long id, String firstName, String lastName, Sex sex, LocalDate birthday, List<Address> addresses, List<String> phones ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        this.addresses = addresses;
        this.phones = phones;
    }
}