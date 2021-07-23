package com.example.myapplication.Stringg

import java.util.*

fun main(args: Array<String>){
    println("Enter a string")
    var sc= Scanner(System.`in`)
    var strr=sc.nextLine()
    println(digits(strr))

}
fun digits(str:String):Any{

    for (i in 0..str.length-1){
        if(str.get(i)>='0'&&str.get(i)<='9'){
           return true
        }
    }
    return false;

}