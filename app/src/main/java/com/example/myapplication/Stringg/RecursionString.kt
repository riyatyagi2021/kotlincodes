package com.example.myapplication.Stringg

import java.util.*

fun main(args: Array<String>){
    println("Enter a string")
    var sc= Scanner(System.`in`)
    var strr=sc.nextLine()
    println(reverse(strr))

}

fun reverse(str:String):String{

    if(str==null||str.length<=1){
        return str
    }else{
        return reverse(str.substring(1))+str.get(0);
    }


}