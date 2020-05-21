package com.bihuniak.educator.human;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address {
    private String street;
    private String city;
    private String country;
    private String postCode;

    public Address(String street, String city, String country, String postCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
    }

    public Address() {
    }
}