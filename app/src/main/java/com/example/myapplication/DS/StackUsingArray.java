package com.example.myapplication.DS;

public class StackUsingArray {

    int stack[] = new int[5];
    int top;


    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public void showw() {
        for (int i:stack) {
            System.out.print(i+" ");
        }
    }

    public int popp(int data){
       // int d;
       top--;
        int da=stack[top];
    stack[top]=0;
        return da;
    }

    int peekk(){
        int data=stack[top-1];
        return data;
    }

}
