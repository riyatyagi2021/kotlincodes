package com.example.myapplication.Programs;

import com.example.myapplication.Programs.InterfaceCommon;

import java.util.ArrayList;
import java.util.List;

public class ClassC implements InterfaceCommon {
    @Override
    public void a(int num) {


        List l2=new ArrayList();
        List l1=new ArrayList();
        l1.add("Riya");
        l1.add("X");
        l1.add("Y");
        l1.add("Z");
        l1.add("Hi");

        l2.add("Riya");
        l2.add("A");
        l2.add("B");
        l2.add("X");

        List list=new ArrayList(l2);
        list.retainAll(l1);
        System.out.println(list);

//        for (int i = 0; i <l1.size() ; i++) {
//            for (int j = 0; j < l1.size() ; j++) {
//                if(l1.get(i).equals(l2.get(i))){
//                    list.add(l1.get(i));
//                }
//            }
//
//        }
//        return list; //// Can't return...void





    }


}
