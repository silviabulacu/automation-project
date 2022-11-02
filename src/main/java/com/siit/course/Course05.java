package com.siit.course;

import com.siit.course.utils.GeneralUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
                "Florin ",
                "Cornel",
                p1
        );
        Car c1 = new Car(
                cb,
                "Ateca",
                Color.GREEN,
                "diesel",
                true,
                "SEAT12345",
                0f,
                100f,
                (byte) 0,
                true,
                45
        );
        c1.printCar();
        c1.paintCar(Color.red);
        c1.printCar();
        c1.accelerate(25f);
        c1.accelerate();
        c1.printCar();
        c1.gearUp();
        System.out.println("Static METHODE CAll!");


        GeneralUtils.printCar(c1);

        Light l1 =new Light();
        l1.dim(20);
        l1.print();
        l1.turnOn();
        l1.print();
        l1.brighten(100f);
        l1.print();
        l1.turnOff();
        l1.print();

        Shape s1 = new Shape("green");
        s1.draw();
        s1.erase();

        Triangle t1 = new Triangle(10,30,30);
        t1.setColor("yellow");
        t1.draw();
        Triangle t2 = new Triangle(24,36,57, "red");
        t2.draw();

        Circle cicle1 =new Circle(5);
        cicle1.setColor("blue");
        cicle1.draw();
        System.out.println(t1.toString());


        Square sq1 =new Square(5);
        sq1.printRectangle();
        sq1.draw();
        System.out.println(sq1.toString());


        Shape t3 =new Triangle(17,45,62,"white");
        t3.draw();

        Shape r2 = new Rectangle(23,45);
        r2.draw();

        Person p3 = new Person(25,'F',"Emilia",165,60,true,new Date(),new Triangle() );

    }

}
