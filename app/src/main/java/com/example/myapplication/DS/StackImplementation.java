package com.example.myapplication.DS;

public class StackImplementation {
    public static void main(String[] args) {

        StackUsingArray st=new StackUsingArray();
        st.push(23);
        st.push(20);
        st.push(13);
        st.push(1);

        st.showw();

        System.out.println(st.peekk());
        System.out.println(st.popp(1));
        st.showw();
    }
}
