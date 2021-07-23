package com.example.myapplication.Programs;

import java.util.Scanner;

public class MainCalClass extends Class1{
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("Select the operation you want to perform");
        System.out.println(" Add");
        System.out.println(" Sub");
        System.out.println(" Mul");
        System.out.println(" Div");
        String op= sc.next();

        Class1 c=new MainCalClass();

        System.out.println(c.cal(n1, n2, op));
    }
}
