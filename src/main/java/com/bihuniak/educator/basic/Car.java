package com.bihuniak.educator.basic;

import javax.persistence.*;

@Entity(name = "asd")
public class Car {

    @Id
    @GeneratedValue
    private long id;

    @Access(value = AccessType.PROPERTY)
//    @Basic(optional = false)
    private String model;
//    @Column(name = "ala", nullable = false)
    private String brand;
    private int wheels;
    private double engineCapacity;
    private boolean secondHand;


    public Car(long id, String model, String brand, int wheels, double engineCapacity, boolean secondHand) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.wheels = wheels;
        this.engineCapacity = engineCapacity;
        this.secondHand = secondHand;
    }

    public Car() {
        System.out.println("Hello from Car empty constructor");
    }

    @Override
    public String toString() {
        return "Car{" +
            "id=" + id +
            ", model='" + model + '\'' +
            ", brand='" + brand + '\'' +
            ", wheels=" + wheels +
            ", engineCapacity=" + engineCapacity +
            ", secondHand=" + secondHand +
            '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model + "F16";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }
}