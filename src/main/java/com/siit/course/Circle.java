package com.siit.course;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {


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
@Override
    public void draw(){
        super.draw("CIRCLE");
}
}
