package com.example.javaprograms.javaaa.interfacee;

public interface Int1 extends Int2{
    void hi();
    default void all(){
        System.out.println("first");
    }
}
