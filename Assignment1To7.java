package jsd3;

import java.util.Scanner;

public class Assignment1To7 {

    public static void main(String[] args) {

        //1.Print your name, hobbies and favorite movie name.
        System.out.println("Sahil Kasbale");
        System.out.println("Playing Cricket");
        System.out.println("Jailer");



        //2.Add five integers (without using variables) and display their sum.
        System.out.println(5+10+5+10+20);



        //3.Add five integers (using variables) and display their sum
        int abc1 = 10, abc2 = 20, abc3 = 30, abc4 = 40, abc5 = 50;
        int sum = abc1 + abc2 + abc3 + abc4 + abc5;
        System.out.println("Sum of Five Integers " + sum);


        //4.Declare 2 float variables and display their sum
        float abc6 = 10.5f;
        float abc7 = 1.93f;
        System.out.println("Sum of two float values "+ (abc6 + abc7));



        //5.Declare 2 double variables and display their difference.
        double abc8 = 150;
        double abc9 = 51;
        System.out.println("Difference of two double variable " + (abc8 - abc9));




       //6.Print "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise
        int mark = 81;
        if (mark >= 50){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }




        /* 7.Initialize 2 numbers and initialize 1 char variable for mathematical operator. Find the sum, difference, product and quotient and remainder
        depending on the mathematical operator value. (Use switch statement) */

        int number1 = 25;
        int number2 = 19;
        char operator;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mathematical Operator");
        operator = sc.next().charAt(0);

        switch (operator){
            case '+' : int add = number1 + number2;
                System.out.println("Sum of Two numbers is " + add);
                break;

            case  '-' : int subtract = number1 - number2;
                System.out.println("Subtraction of two numbers is " + subtract);
                break;

            case  '*' : int product = number1 * number2;
                System.out.println("Product of two numbers is " + product);
                break;

            case  '/' : int quotient = number1 / number2;
                System.out.println("Quotient of two numbers is " + quotient);
                break;

            case  '%' : int remainder = number1 % number2;
                System.out.println("Remainder of two numbers is " + remainder);
                break;

            default:
                System.out.println("Please Enter a valid Operator....!");
        }
    }
}