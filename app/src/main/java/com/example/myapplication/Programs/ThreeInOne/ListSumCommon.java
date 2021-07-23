package com.example.myapplication.Programs.ThreeInOne;

import java.util.ArrayList;
import java.util.List;

public class ListSumCommon {
    public static void main(String[] args) {
        List l1=new ArrayList();
        List l2=new ArrayList();
        l1.add("Riya");
        l1.add("Sonia");
        l1.add("Nupur");
        l1.add("Srashti");
        l1.add("Aditi");
        l2.add("Riya");
        l2.add("Aditi");

        List l3=new ArrayList();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);

        System.out.println(common(l1,l2));
        System.out.println(sum(l3));
        System.out.println(partition(50));

    }

    public static List<String> common(List<String> l1, List<String> l2){
        List <String> l=new ArrayList<String>();
        for (int i = 0; i <l1.size() ; i++) {
            for (int j = 0; j <l2.size() ; j++) {
                if(l1.get(i).equals(l2.get(j))){
                    l.add(l1.get(i));
                }
            }
        }
        return l;

    }

    public static int sum(List<Integer>a){
        int sum=0;
        for (int i = 0; i <a.size() ; i++) {
            sum += a.get(i);
        }
        return sum;
    }

    public static int partition(int page){
        int a=page/10;
        if(page%10==0){  //if page is exactly divisible
            a=a-1;

        }
        return a+1;

    }

}
