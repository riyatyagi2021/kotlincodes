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

    nearzero(arr,arrsize)


}

fun nearzero(arr:Array<Int>, size:Int):Unit {
    var ls:Int
    var sum:Int
    var fe:Int
    var se:Int

    if(size<=2){
        println("Invalid input")
        return
    }
    fe=0
    se=1
    ls=arr[0]+arr[1]

    for(i in arr.indices){
        for (j in i+1 until arr.size){
            sum=arr[i]+arr[j]

            if(Math.abs(ls)>Math.abs(sum)){
                ls=sum
                fe=i
                se=j
            }
        }
    }

println(" Sum of "+ arr[fe]+ " and " +  arr[se] +" is near to zero "+  ls)



}
