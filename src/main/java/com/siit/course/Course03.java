package com.siit.course;

public class Course03 {

    static int x = 0;

    public static void main(String[] args) {
        final double PI = 3.14;
        final int MAX_SIZE = 100; // naming convention all uppercase split by _
        int y = 1; // primitive
        String name = "Silvia";
        char MyChar = 'a';
        y = y + 5; // y += 5;


        float a = 100.45f;
        double b = 100.45f;

        boolean myBool = true;
        char myChar2 = 97;

        Integer i1 = 100; // wrapper object on top of int primitive


        System.out.println("Hello course 03!");
        System.out.println(name);
        System.out.println("My name is " + name);

        System.out.println(args[0] + " " + args[1]);
        System.out.println(args[0] + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
//        System.out.println(args[2]);
        System.out.println(myBool);
        System.out.println(myChar2);

        System.out.println(500 / 3.0f);
        System.out.println(500 / 3);

        if (x > 5) {
            System.out.println("Number is greater than 5");
        }

        if (y < MAX_SIZE) {
            System.out.println("Number is greater than " + MAX_SIZE);
        } else {
            System.out.println("Number exceeds the max size of" + MAX_SIZE);
        }

        switch (y) {
            case 0: { // y==0 --> TRUE
                System.out.println("Number is 0");

                break;
            }
            case 1: { //y==1 --> TRUE

                break;
            }
            default: {
                System.out.println("Not 0 not 1");
            }


        }
    // while example
        int index = 0;
        while (myBool) {
            System.out.println(" WHILE Infinite loop!" + index);
            if (index > 10) {
                myBool = false;
            }
            index++;
        }
        // do while example
        myBool = true;
        index =0;
        do {
            System.out.println("DO WHILE Infinite loop!!" + index);
            if (index > 10) {
                myBool = false;
            }
            index++;
        }
        while (myBool) ;
        index = 0;
        // rewrite without myBool
        do {
            System.out.println("DO WHILE Infinite loop!!" + index);
            if (index > 10) {
                break;
            }
            index++;

        }
        while (true);

        for (index = 0 ; index <= 10 ; index++) {
            System.out.println("FOR Infinite loop!!" + index);
        }

        for(index = 0 ; index <= args.length -1; index++) {
            System.out.println(args[index]);

            for (String s : args) {
                System.out.println(s);
            }
            for (char c : name.toCharArray()) {
                System.out.println(c);
            }
        }
        // Calculate the sum of the first 100 numbers higher than 0
        int sum = 0;
        for (int i = 1; i < 101; i++) {
           sum = sum +i; // sum +=1
        }
        System.out.println("Suma este " +sum );

        System.out.println("Suma este " +(MAX_SIZE *(MAX_SIZE +1))/2);

        // Display all the prime numbers lower than 1 000 000

        final int MAX_NUMBER = 1000000;
        int countPrime = 0;
        for (int i = 2; i < MAX_NUMBER; i++) {
            // i is the current number we test if it is prime
            boolean isPrime = true;
            for (int j = 2; j < i /2; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println("Number " + i + "is prime");
                countPrime++;
            }
//            else {
//                System.out.println("Number " +i + "is even");
//            }
       }
        System.out.println("Total number of primes are " + countPrime);

    }


}
