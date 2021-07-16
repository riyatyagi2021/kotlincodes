package com.example.javaprograms.javaaa.exceptionprograms;

public class Exce extends Validate{
    public static void main(String[] args) {
        try{
            int i=20/0;
            System.out.println(i);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Please check the code");

        }
    }

