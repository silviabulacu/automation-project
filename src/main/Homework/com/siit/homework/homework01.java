package com.siit.homework;



public class homework01 {

public static void main(String[] args) {
    int year = Integer.parseInt(args[0]);
     int x = 1900;
     int y = 2016;

     if ((x > year) || (y < year) ) {

         System.out.println("Year is invalide!");

        }
     else {
         System.out.println( "Year is valide!");
         if(isLeapYear(year)) {
             System.out.println( "This is a leap year, February has 29 Days");
         } else {
             System.out.println( "This it's not a leap year, February has 28 Days");
         }

     }
}



// Display the number of days in month February from a year between 1900-2016 that is read from keyboard

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}



    //Implement an arithmetic calculator that takes 3 arguments: the first number, the operation, the second number.

//    public static void main(String[] args)
//    {
//        if (args.length == 3)
//        {
//            float a = Float.parseFloat(args[0]);
//            float b = Float.parseFloat(args[2]);0
//            String operator = args[1];
// implement calculator logic here
//            System.out.println("Result is: " + result);
//        }
//        else {
//            System.err.println("3 args are needed!");
//        }
//    }
