package com.example.javaprograms.javaaa.stringcl;

public class Stringprac {
    public static void main(String []args){
        String s="Riya";
        String s1="Tyagi";
        String s2="Andoid Training is going on";
        char[] ch={'r','i','y','a'};
        String cr=new String(ch);
        System.out.println(cr);

        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());


      char[] c= s.toCharArray();
      for(char x:c){
          System.out.println(x);
      }

        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(2));
        System.out.println(s.concat(s1));

        String[] sp=s2.split(" ");
        for(String y:sp){
            System.out.println(y);
        }

        System.out.println(s.replace('a', 'b'));
        System.out.println(s);


            StringBuffer sb=new StringBuffer("Riya");
        System.out.println(sb.append(" Tyagi"));
    }
}
