package com.example.myapplication.Stringg

fun main(args: Array<String>){
count("riyatyagi" ,  'r')

}
fun count(st:String, ch:Char):Unit{
    var count=0
    for (i in 0..st.length-1){
        if(st.get(i)==ch){
            count++
        }
    }
    println(ch + " "+ count)
}