package com.example.myapplication.Programs;

import java.util.Scanner;


public class MainCommon {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter any value: 1   2   3 ");
        int num=sc.nextInt();
        choice(num);
    }


   static void choice(int num){
        if(num==1){
            //System.out.println(aobj.a());
            ClassA aobj=new ClassA();
            aobj.a(1);
        }else if(num==2){
            classB bobj=new classB();
            bobj.a(2);
        }else{
            ClassC cobj=new ClassC();
            cobj.a(3);
        }
    }

}
