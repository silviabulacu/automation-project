package com.siit.course.utils;

public class MathFunctions {

    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int compareNumbers (int x, int  y ){
        if (x > y) {
            return 1;
        }
        else {
            if (x < y) {
                return -1;
            }
        }

      return 0;
    }

    public static void compareNum ( int x, int y ){
        int compareNum = compareNumbers(x, y);
        switch (compareNum) {
            case 0: {
                System.out.println( "Numbers are equals" );
                break;
            }
            case 1: {
                System.out.println( x +  " is greater than "  + y );
                break;
            }
            case -1: {
                System.out.println( x + " is less than " + y);
                break;
            }
            default:{
                System.out.println( "Error encountered!!" );
            }

        }
    }

    public static boolean isOdd(int n ) {
        return n % 2 == 1;
// return ( n % 2 ==1) ? true : false;  --> if construction in one line!!
    }
}
