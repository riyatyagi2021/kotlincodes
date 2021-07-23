package com.example.myapplication.Programs.Form;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FormList {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashMap h=new HashMap();


int con=1;

       while(con!=0) {

           System.out.println("Enter your name");
           String name = sc.next();
           System.out.println("Enter your age");
           int age = sc.nextInt();
           System.out.println("Select your technology");
           System.out.println("Flutter");
           System.out.println("Android");
           System.out.println("React");
           System.out.println("IOS");
           System.out.println("Node");
           String tech = sc.next();
           System.out.println("Name: " + name + "     " + "Tech: " + tech);

           h.put(name, tech);
           System.out.println("Want to continue..Press 1");
           System.out.println("Want to exit..Press 0");
            con=sc.nextInt();


       }

        Set<Map.Entry<String, String>> list  = h.entrySet();

        for (Map.Entry<String, String> entry : list) {
            System.out.print("Name: "+ entry.getKey());
            System.out.println(", Technology: "+ entry.getValue());
        }


   }



    }




