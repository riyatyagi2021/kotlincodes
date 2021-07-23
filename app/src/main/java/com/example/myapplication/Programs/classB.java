package com.example.myapplication.Programs;

import com.example.myapplication.Programs.InterfaceCommon;

import java.util.ArrayList;
import java.util.List;

public class classB implements InterfaceCommon {
    @Override
    public void a(int num) {
      List<Integer> l1=new ArrayList<>();
      l1.add(2);
      l1.add(2);
      l1.add(2);
      l1.add(2);
      l1.add(5);
      l1.add(2);
      l1.add(2);
      l1.add(2);

        System.out.println(l1);
    }


}
