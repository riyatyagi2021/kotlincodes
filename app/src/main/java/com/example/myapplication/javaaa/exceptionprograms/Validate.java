package com.example.javaprograms.javaaa.exceptionprograms;

public class Validate {
    public static void ageValidate(int age) throws AgeNotValid {
        if (age>= 18) {
            System.out.println("Yes" );
        } else {
            throw new AgeNotValid();
        }
    }

    public static void main(String[] args) throws AgeNotValid {

            Validate.ageValidate(21);

    }
}