package com.example.myapplication.Programs

fun main(){
    var l1 = mutableListOf<String>()
    var l2 = mutableListOf<String>()
    l1.add("Riya")
    l1.add("Sonia");
    l1.add("Nupur");
    l1.add("Srashti");
    l1.add("Aditi");
    l2.add("Riya");
    l2.add("Aditi");

    var l3 = mutableListOf<Int>()
    l3.add(1)
    l3.add(2)
    l3.add(4)
    l3.add(6)

    println(common(l1, l2))
    println(summ(l3))
    println(partition(20))
}

fun  common(l1: List<String> , l2:List<String>) :List<String>{
    var l = mutableListOf<String>()
    for(i in 0 until l1.size){
        for(j in 0 until l2.size){
            if(l1.get(i).equals(l2.get(j))){
                l.add(l1.get(i))
            }
        }
    }
    return l;
}


fun summ(l3:List<Int>):Int{
    var sum=0
    for(i in 0 until l3.size){
        sum+= l3.get(i)
    }
    return sum
}

fun partition(page:Int):Int{
    var a=page/10
    if(page%10==0){
        a=a-1
    }
    return a+1
}



