package com.example.myapplication.Stringg

fun main(args: Array<String>){
    var st="nama"
    var reverse:String=""
    var l:Int=st.length-1

    while(l!=-1) {
        reverse+=st[l--];
    }
    if(st==reverse)
        println("Palindrome ");
    else
        println("Not a Palindrome ");
}