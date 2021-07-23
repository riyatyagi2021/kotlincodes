package com.example.myapplication.Stringg

fun main(args: Array<String>) {
     var st:String="riyatyagi"
    var ch = st.toCharArray()
    for(i in 0 until st.length){
        for(j in i+1 until st.length)
            if(ch[i]==ch[j]){
                println(ch[i])
                break
            }
    }

}