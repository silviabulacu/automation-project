package com.siit.course;

public class Cicle {
    int radius;

    public Cicle (int radius) {
        this.radius = radius;
    }

    public Cicle() {


    }
    public double getArea() {
        return Math.PI * Math.pow( radius, 2);
    }

    public double getLenght() {
        return 2 * Math.PI * radius;
    }

    public void printCicle() {
        System.out.println(" Cicle with radius "  + radius  +  " has area "  +  getArea() + " and length " + getLenght());
    }

}
