package com.example.javaprograms.javaaa.collectionn;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;
        return -(i1-i2);
    }

    public static void main(String[] args) {
        TreeSet ts=new TreeSet(new ComparableComparator());
        ts.add(32);
        ts.add(2);
        ts.add(322);
        ts.add(3);
        System.out.println(ts);
    }
}
