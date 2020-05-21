package com.bihuniak.educator.human;

import javax.persistence.Embeddable;

@Embeddable
public class BuildingNumber {
    private long number;
    private String gate;

    public BuildingNumber() {
    }

    public BuildingNumber(long number, String gate) {
        this.number = number;
        this.gate = gate;
    }
}
