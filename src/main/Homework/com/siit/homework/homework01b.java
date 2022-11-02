package com.siit.homework;


  //Implement an arithmetic calculator that takes 3 arguments: the first number, the operation, the second number.

public class homework01b {
    public static void main(String[] args)
    {
        if (args.length != 3) {
            System.err.println("3 args are needed!");
        return;
        }

        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[2]);
        String varOperator = args[1];
        float result = 0;

        switch (varOperator) {
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
            default:
                System.out.println("This operator does not exist!!");
                break;
        }

        System.out.println("Result is: " + result);

    }
}

