package com.siit.homework;


//Leap Year
public class homework01 {

    // Display the number of days in month February from a year between 1900-2016 that is read from keyboard

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
