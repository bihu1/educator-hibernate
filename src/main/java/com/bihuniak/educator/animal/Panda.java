package com.bihuniak.educator.animal;

import javax.persistence.Entity;

@Entity
public class Panda extends Animal{
    private boolean angry;
    @Override
    public void getYourSound() {
        System.out.println("Brrrrrru");
    }

    public Panda(String species, String name, boolean angry) {
        super(species, name);
        this.angry = angry;
    }

    public Panda() {}
}
