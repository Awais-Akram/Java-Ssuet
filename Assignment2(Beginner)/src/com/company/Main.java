package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     /*   //Question 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number : ");
        int a = scanner.nextInt();
        System.out.println("Square : " + a*a + " , Cube : " + a*a*a + " , Fourth : " + a*a*a*a);
    */


     /*   //Question 3

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Integer : ");
        int a = scan.nextInt();
        System.out.println("Please Enter Second Integer : ");
        int b = scan.nextInt();
        if (a != b){
            System.out.println(a + " is Not Equal to " + b);
        } if (a < b) {
            System.out.println(a + " is Less Then to " + b);
        } if (a <= b){
            System.out.println(a + " is Less Then or Equal to " + b);
        } else {
            System.out.println(a + " is Greater Then " + b);
        }
    */

     /*   //Question 5

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Years of Experience : ");
        int exp = scan.nextInt();
        System.out.println("Please Enter Your Age : ");
        int age = scan.nextInt();
        System.out.println("Please Enter Your Present Salary : ");
        int sal = scan.nextInt();
        if (exp < 3 && age < 40) {
            double newSal = sal * 0.2;
            sal = (int) newSal + sal;
            System.out.println("You Get 20% raise in your Salary, Now your new Salary is " + sal);
        } else if(exp == 3 || exp < 5 && age < 40) {
            double newSal = sal * 0.3;
            sal = (int) newSal + sal;
            System.out.println("You Get 30% raise in your Salary, Now your new Salary is " + sal);
        } else if(exp > 7 && age > 40){
            double newSal = sal * 0.5;
            sal = (int) newSal + sal;
            System.out.println("You Get 50% raise in your Salary, Now your new Salary is " + sal);
        } else if(exp == 6 || exp == 7) {
            System.out.println("You Get No raise in your Salary, So Your Salary is Still " + sal);
        }
    */

     /*       //Question 6
        for(int x = 1; x < 6; x++){
            System.out.println("8 * " + x + " = " + 8*x);
        }
     */

     /*       //Question 7

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Number of Rows: ");
        int r = scan.nextInt();
        for(int i = 1; i <= r; i++)
        {
            for(int j = 1 ; j <= i; j++)
                System.out.print(j);
            System.out.println(" ");
        }
     */

     /*       //Question 9

       int a = 20;
       int b = 10;
       System.out.println("A = 20");
       System.out.println("B = 10");
        if (a != 10 ){
            System.out.println( a + " in not equal to 10");
        }if(a > 10 || b > 10){
            System.out.println( "Either " + a + " or " + b + " is greater than 10");
        }
    */

     /*       //Question 10

        Scanner scan = new Scanner(System.in);
        System.out.print("A = ");
        int a = scan.nextInt();
        System.out.print("B = ");
        int b = scan.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping\nA = " + a + "\nB = "+ b);
    */

    }
}
