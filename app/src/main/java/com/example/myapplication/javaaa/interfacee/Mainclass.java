package com.example.javaprograms.javaaa.interfacee;

public class Mainclass implements Intt{
//public class Mainclass implements Intt, Int1{
    public static void main(String []args) {
//        Int1 i=new Mainclass();
//        i.all();
//        Intt i2=new Mainclass();
//        i2.all();
//    }
//    @Override
//    public void hi() {
//    }
//    @Override
//    public void all() {
//        Intt.super.all();
//        System.out.println("ok");

        Intt m = new Mainclass();
        m.c();
        m.all();
    }



    @Override
    public void c() {
        System.out.println("Bingo");
    }
}
