package com.example.myapplication.Stringg

fun main(args: Array<String>){
    var st:String="I am Riya"
   st.toLowerCase()

    var reverseSt:String=""
  //  val w = arrayOf(st.split("\\s"))
    val w = st.split(" ".toRegex()).toTypedArray()     // Why?


    for (i in w.indices.reversed()){
        reverseSt = reverseSt +" "+w[i]

    }
    println(reverseSt)

}



