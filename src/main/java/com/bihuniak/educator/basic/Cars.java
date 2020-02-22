package com.bihuniak.educator.basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cars {




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String model;

    private int whels;
    private double engineCopasity;
    private boolean isUsed;

    public Cars() {
    }

    public Cars(String model, int whels, double engineCopasity, boolean isUsed) {
        this.model = model;
        this.whels = whels;
        this.engineCopasity = engineCopasity;
        this.isUsed = isUsed;
    }
}