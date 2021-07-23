package com.example.myapplication.Programs;

public class ArraySum {
    public static void main(String[] args) {
        int arr[]={2,3,5,-1,9,4,-4};
        //int op arr={16,15,13,19,9,14,18};
      //  int arr2[]=new int[arr.length];
        int i;
        int sum = 0;
        for ( i = 0; i <arr.length; i++) {
            sum = sum + arr[i];
        }
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sum - arr[j];
            }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
