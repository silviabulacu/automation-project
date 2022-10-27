package com.siit.course;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class Course05 {
    public static void runCourse05() {
        double d1 =Double.parseDouble("123.45");
        Person p1 = new Person(34,'F',"Alexandra",165,60,false);
        p1.setBirthday(new Date(1988, Calendar.DECEMBER,25));
        System.out.println(" Birthday is " + p1.getBirthday());
        CarBrands cb = new CarBrands(
                "Seat",
                new Date(1980, Calendar.FEBRUARY, 15),
                "Florin Bucur",
                "Cornel",
                p1
        );
        Car c1 = new Car(
                cb,
                "Ateca",
                Color.GREEN,
                "diesel",
                true,
                "SEAT12345"
        );
        c1.printCar();
        c1.paintCar(Color.red);
        c1.printCar();



    }

}
