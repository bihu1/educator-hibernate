package com.bihuniak.educator.animal;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cat extends Animal{
    private boolean fluffy;
    @Override
    public void getYourSound() {
        System.out.println("Meow");
    }

    public Cat(String species, String name, boolean fluffy) {
        super(species, name);
        this.fluffy = fluffy;
    }

    public Cat() {}

    public boolean isFluffy() {
        return fluffy;
    }
}