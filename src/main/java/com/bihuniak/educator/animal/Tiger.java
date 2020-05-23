package com.bihuniak.educator.animal;

import javax.persistence.Entity;

@Entity
public class Tiger  extends Cat{
    private int speed;

    public Tiger(String species, String name, boolean fluffy, int speed) {
        super(species, name, fluffy);
        this.speed = speed;
    }

    public Tiger() {
    }


}
