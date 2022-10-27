package com.siit.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Car {

    public final float ACC_Step = 5;
    private CarBrands brand;
    private String model;
    private Color color;
    private String fuelType;
    private boolean isNew;
    private String vin;

    private float currentSpeed;
    private float fuelLevel;
    private byte gear;

    public Car(CarBrands brand, String model, Color color, String fuelType, boolean isNew, String vin) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.isNew = isNew;
        this.vin = vin;
    }

    public void accelerate(){
        currentSpeed += ACC_Step;

    }

    public void paintCar(Color color){
        this.color = color;

    }

    public void printCar(){
        System.out.println("..................");
        System.out.println(" CAR MODEL " + this.model);
        System.out.println(" CAR BRAND " + this.brand.getName());
        System.out.println(" CAR COLOR " + this.color);
        System.out.println(" CURRENT SPEED " + this.currentSpeed);
        System.out.println(" CURRENT GEAR " +this.gear);
    }
}
