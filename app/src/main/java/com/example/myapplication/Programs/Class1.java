package com.example.myapplication.Programs;

public class Class1 implements IntCal {
    @Override
    public int cal(int n1,int n2, String op) {
        switch (op) {
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

