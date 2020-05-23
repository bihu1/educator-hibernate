package com.bihuniak.educator.animal;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Animal {
    @Id
    @GeneratedValue
    private long id;
    private String species;
    private String name;

    public abstract void getYourSound();

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public Animal() {
    }

    public long getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }
}
