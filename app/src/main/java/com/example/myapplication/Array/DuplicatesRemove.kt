package com.example.myapplication.Array

import java.util.*

fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    println("Enter size of array")
    var arrrsize = sc.nextInt()
    var arr = Array<Int>(arrrsize) { 0 }
    var temp = Array<Int>(arrrsize) { 0 }
    println("Enter elements of array")
    for (i in arr.indices) {
        arr[i] = sc.nextInt()
    }
    arr.sort()
println(remove(arr,arrrsize,temp))


}

fun remove(arr:Array<Int>, size:Int,temp:Array<Int>){
    var j=0
        for (i in arr.indices) {

          if (arr[i]!=arr[i+1]){
              temp[j++]=arr[i]
          }

        }
    temp[j++]=arr[size-1]
    for (i in 0 until j) {
        arr[i] = temp[i]
        println(arr[i])
    }

}


