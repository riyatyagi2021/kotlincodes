package com.example.myapplication.Stringg

import java.util.*


fun main(args: Array<String>){
    println("Enter a string")
    var sc= Scanner(System.`in`)
    var strr=sc.nextLine()
    println(permutations(" ",strr))

}

fun permutations(candidate:String ,remaining:String):Unit{

    if (remaining.length === 0) {
        System.out.println(candidate)
    }

    for (i in 0 until remaining.length) {
        val newCandidate: String = candidate + remaining.get(i)
        val newRemaining: String = remaining.substring(0, i) +
                remaining.substring(i + 1)
        permutations(newCandidate, newRemaining)
    }




}