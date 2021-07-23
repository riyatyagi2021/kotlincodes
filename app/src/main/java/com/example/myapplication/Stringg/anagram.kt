package com.example.myapplication.Stringg


fun main(args: Array<String>){
    var s1="riya"
    var s2="iay"

    if(s1.length==s2.length){
        val char1 = s1.toCharArray()
        val char2 = s2.toCharArray()
        char1.sort();
        char2.sort();
       val result = char1.contentEquals(char2)

        if(result){
            println("Yes, these are anargams")
        }else{
            println("No, not anargams")
        }

    }else{
        println("No, these are not anargams")
    }


}