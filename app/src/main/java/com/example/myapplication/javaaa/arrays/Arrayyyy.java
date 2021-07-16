package com.example.kotlin.javaaa.arrays;

public class Arrayyyy {
    public static void main(String[] args) {
        int [] a={1,3,2,6,3,7};
        for (int x:a) {
            System.out.println(x);
        }


        //2D Array
        int [][] arr={{1,2,3,4},{4,5,6,7},{8,3,5,6}};
        for (int i = 0; i <4 ; i++) {
            for (int j= 0; j <4 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
