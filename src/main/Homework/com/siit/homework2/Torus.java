package com.siit.homework2;

import com.siit.course.utils.MathFunctions;

public class Torus extends MathFunctions {

    public static double computeVolume(int radius, int distance) {
        // Value of Pi
        float pi = (float)3.14159;
        return 2 * pi * pi * distance * radius * radius;

    }
}
