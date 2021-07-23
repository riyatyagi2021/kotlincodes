package com.example.myapplication.Array

import java.util.*


fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    println("Enter size of array")
    var arrsize = sc.nextInt()
    var arr = Array<Int>(arrsize){ 0 }
    println("Enter elements of array")

    for (i in arr.indices) {
        arr[i] = sc.nextInt()
    }
      arr.sort()

    println("Select any element ")
    var num = sc.nextInt()
    given(arr,arrsize,num)

}

fun given(arr:Array<Int>, size:Int , numm:Int):Unit{

    var sum:Int


    for(i in arr.indices){
        for (j in i+1 until arr.size){
            if(arr[j]==numm-arr[i]){
                println("Pairs are "+arr[j] +"and "+ arr[i])
                break
            }
        }

    }


}