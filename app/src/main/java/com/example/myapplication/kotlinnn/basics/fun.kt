package com.example.myapplication.kotlinnn.basics

fun main() {
val myLambda: (Int)->Unit={s:Int-> println(s)}
    add(2,3,myLambda)
}

//Lambda Functionn
fun add(a:Int, b:Int, action:(Int)->Unit){
    val add=a+b
    action(add)
}

