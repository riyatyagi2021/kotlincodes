package com.example.javaprograms.javaaa.collectionn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrograms {
    public static void main(String[] args) {
        System.out.println("Hash Set");
       Emp e1=new Emp("Hello");

        Set<Emp> hs=new HashSet();
        hs.add(new Emp("Riya"));
       hs.add(e1);
        hs.add(new Emp("B"));
        hs.add(new Emp("A"));
        hs.add(new Emp("C"));
        hs.add(new Emp("C"));
      //hs.add(12);
       // hs.add(12.6);
        for (Emp o:hs
             ) {
            System.out.println(o.name);
        }

        System.out.println();
        System.out.println("Linked Hashset");

        //LINKED HASHSET
        Set ls=new LinkedHashSet();
        ls.add(23);
        ls.add(23);
        ls.add(28);
        ls.add(23.9);
        ls.add("Riya");
        Iterator i=ls.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


        System.out.println();
        System.out.println("Tree Set");
       TreeSet ts=new TreeSet();
        ts.add(23.9);
        ts.add(23.0);
        ts.add(28.6);
        ts.add(2.0);
        //ts.add(23.9);
        //ts.add("Riya");
        Iterator i1=ts.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }


    }
}
