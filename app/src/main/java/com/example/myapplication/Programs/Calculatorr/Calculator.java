package com.example.myapplication.Programs.Calculatorr;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

            try {
                System.out.println("Enter first number");
                int n1 = sc.nextInt();
                System.out.println("Enter second number");
                int n2 = sc.nextInt();
                System.out.println("Select the operation you want to perform");
                System.out.println(" Add");
                System.out.println(" Sub");
                System.out.println(" Mul");
                System.out.println(" Div");
                String operation = sc.next();
                System.out.println(cal(n1, n2, operation));

            } catch (Exception e) {
                System.out.println("Enter Integer value");
                sc.nextLine();
            }
    }


    public static int cal(int n1, int n2, String operation) {
        switch (operation) {
            case "Add":
                return n1 + n2;
            case "Sub":
                return n1 -n2;
            case "Mul":
                return n1 *n2;
            case "Div":
                return n1 / n2;
            default:
                System.out.println("Invalid input");
        }
          return 0;
    }

}
