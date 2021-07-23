package com.example.myapplication.kotlinnn.basics

fun main(args: Array<String>){
    var arr1=intArrayOf(1,4,2,7)
   // var arr2=arrayOf(1,2,"Riya")
    var arr3=arrayOf<String>("R","I")
   // var arr4=intArrayOf()

    arr1.set(2,4)
    arr3.set(0,"W")

    for (i in arr1){
        print(i)
    }
    println()
    for (i in arr3){
        print(i)
    }
    println()
    arr3[1]="Hi"
    for (i in arr3){
        print(i)
    }
    println()

    var arr5= intArrayOf(5)
    arr5[1]=4
    arr5[3]=5
    for (i in arr5){
        print(i)
    }


}