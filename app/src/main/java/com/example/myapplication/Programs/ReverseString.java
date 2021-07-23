package com.example.myapplication.Programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println(reverse(s));

    }

    static String reverse(String s) {

        String w[] = s.split(" ");


        String reverseString = "";


        for (int i = w.length - 1; i >= 0; i--) {

          reverseString = reverseString+" " + w[i] ;//Right
           // reverseString =w[i]+ " "+reverseString ;// Wrong output

        }

        return reverseString;
    }

}

