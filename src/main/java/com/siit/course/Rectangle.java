package com.siit.course;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Rectangle {

    private int width;
    private int height;

    public Rectangle( int height, int width){
        this.height = height;
        this.width = width;


    }

    public int computeArea(){
        return height * width;
    }
    public int computePerimeter(){

        return 2 *(width + height);
    }
    public  double computeDiagonal(){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }

    public void printRectangle(){
        System.out.println("Area is " + computeArea());
        System.out.println("Perimeter is " + computePerimeter());
        System.out.println("Diagonal is " +  computeDiagonal());

    }

}
