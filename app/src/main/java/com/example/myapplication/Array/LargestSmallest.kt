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

    arr.sort()
    println("Smallest number is "+ arr.get(index = 0))
    println("Highest  number is "+ arr.get(arr.size-1))





}