package com.siit.homework2;

import com.siit.course.utils.MathFunctions;

public class Pyramid extends MathFunctions
{
    public static double computeVolume(double length, double width, double height)
    {
        return ((length * width) * height) / 3;
    }
}
