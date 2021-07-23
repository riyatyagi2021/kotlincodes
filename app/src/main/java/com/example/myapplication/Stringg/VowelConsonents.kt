package com.example.myapplication.Stringg

import java.util.*

fun main(args: Array<String>){
    println("Enter a string")
  //  var st = readLine()
    var sc= Scanner(System.`in`)
    var strr=sc.nextLine()
    vowelConso(strr)


}

fun vowelConso(str:String):Unit{
    str.toLowerCase()
    var ch=str.toCharArray()
 var vc=0
    var cc=0
    for (i in 0..ch.size-1) {
        if ((str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')) {
            vc++
        } else if (ch[i] >= 'a' && ch[i]<='z'){
            cc++
        }
    }
    println("Vowels " + vc)
    println("Consonants " + cc)
}