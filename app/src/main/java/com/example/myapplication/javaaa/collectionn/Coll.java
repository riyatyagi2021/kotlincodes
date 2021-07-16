package com.example.javaprograms.javaaa.collectionn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Coll {


    enum days{Monday,Tuesday, Wednesday, Thursday};
    public static void main(String[] args) {
        switch (days.Tuesday){
            case Monday:
                System.out.println("Hello");
                break;
            case Tuesday:
                System.out.println("Hola");
                break;
            case Wednesday:
                System.out.println("Hey");
                break;
            case Thursday:
                System.out.println("Hi");
                break;

        }

       ArrayList c=new ArrayList();
        c.add(12);
        c.add(162);
        c.add(123);
        c.add(12.9);
        //c.add("Riya");

        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.contains(123));
        System.out.println(c.remove(12.9));
        System.out.println(c);
        System.out.println(c.isEmpty());

        Object[] arr=c.toArray();
        for (Object o:arr) {
            System.out.println(o);
        }
        // Iterator use
        Iterator i=c.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Collections.sort(c);
        System.out.println(c);
    }


}
