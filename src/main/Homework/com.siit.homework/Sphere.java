package com.siit.homework;

import com.siit.course.utils.MathFunctions;

// Sphere compute volume -->>Volume= (4/3)*pie*r3
public class Sphere extends MathFunctions {

    public static double computeVolume(int radius) {
        double pie=3.14285714286;

        return (4.0/3.0)*pie*(radius*radius*radius);
    }

//    public static void main(String args[])
//    {
//        int radius=48;
//        double pie=3.14285714286;
//        double volume=(4.0/3.0)*pie*(radius*radius*radius);
//
//        System.out.println("Volume of the sphere="+volume);
//    }
}



