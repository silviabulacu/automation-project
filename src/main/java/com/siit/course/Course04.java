package com.siit.course;


import static com.siit.course.utils.MathFunctions.*;

public class Course04 {

    public static void drawShapeCorners(int width, int height) {
        for (int i = 0; i < height; i++) {
            for ( int j = 0; j < width; j++) {
                if ((i == 0 || i == height -1) && (j == 0 || j == width -1)) {
                    System.out.println("*");
                }
                else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }


    public static void drawShapeOutline (int width, int height){
        for ( int i = 0; i < height ; i++) {
            for ( int j = 0; j < width ; j++) {
                if (i == 0 || i == height -1) {
                    System.out.print("*");
                }
                else {
                    if (j == 0|| j== width -1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");

                    }

                }

            }
            System.out.println();
        }

    }


    //Write a method that prints a rectangle out of “*”.

    public static void drawFullShape( int width, int height) {
        for ( int i = 0; i < height ; i++) {
            for ( int j = 0; j < width ; j++) {
                System.out.print( "*");

            }
            System.out.println();
        }

    }
    private static void drawFullShape(int i) {
        drawFullShape(i,i); //a square is a rectangle with the same
    }



    }



    public static void runCourseCode4() {
        int n = 123456;
        System.out.println(" Number " + n + " is " + isPrimeNumber(n));
        int r =compareNumbers(100, 500);
        compareNum(600, 670);
        System.out.println( " Number " + n  +  " is odd? " + isOdd(n));
        drawFullShape(3,5); // rectangle
        drawShapeOutline(7,13);
        drawShapeCorners(7,13);
        drawFullShape(5); //square
    }


}
