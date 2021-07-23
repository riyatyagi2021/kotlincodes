package com.example.myapplication.Array

import java.util.*

fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    println("Enter size of array")
    var arrrsize = sc.nextInt()
    var arr = Array<Int>(arrrsize) { 0 }

    println("Enter elements of array")
    for (i in arr.indices) {
        arr[i] = sc.nextInt()
    }
    var sum=0
    for (i in arr.indices){
        sum+=arr[i]
    }
    println("Avg is "+ sum/arrrsize)

}