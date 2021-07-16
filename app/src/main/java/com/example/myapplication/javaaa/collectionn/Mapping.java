package com.example.javaprograms.javaaa.collectionn;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapping {
    public static void main(String[] args) {
        HashMap<Integer,Character> h=new HashMap<>();
        h.put(1, 'R');
        h.put(2, 'i');
        h.put(3, 'y');
        h.put(4, 'a');
        h.put(5, 'b');

        System.out.println(h.size());
        System.out.println(h.get(4));
        System.out.println();

        //Using Iterator
        Set set=h.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext()){
            Map.Entry entry= (Map.Entry) it.next();   //Why upcasting?
            System.out.println(entry.getKey() + "   "+entry.getValue());
        }

        System.out.println();
        System.out.println();

        //Using For Each Loop
        for(Map.Entry m:h.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }
    }
}
