package com.siit.homework;

public class HomeworkMain {
    public static void main(String[] args){

        System.out.println("Volume of the sphere with radius 3 is: "+ Sphere.computeVolume(3));

        System.out.println("Volume of the pyramid is: "+ Pyramid.computeVolume(3, 11, 2));

        System.out.println("Volume of the torus with radius 3 is: "+ Torus.computeVolume(3, 7));

    }
}
