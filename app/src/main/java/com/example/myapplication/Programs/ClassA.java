package com.example.myapplication.Programs;

import com.example.myapplication.Programs.InterfaceCommon;

import java.util.ArrayList;
import java.util.List;

public class ClassA implements InterfaceCommon {
    @Override
    public void a(int num) {
        List l=new ArrayList();
        l.add("Riya");
        l.add("A");
        l.add("B");
        l.add("C");

        System.out.println(l);
    }


}
