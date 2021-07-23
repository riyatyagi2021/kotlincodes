package com.example.myapplication.Array

fun getOddOccurrence(arr: IntArray, arr_size: Int): Int {
    var i: Int
    i = 0
    while (i < arr_size) {
        var count = 0
        for (j in 0 until arr_size) {
            if (arr[i] == arr[j]) count++
        }
        if (count % 2 != 0) return arr[i]
        i++
    }
    return -1
}


fun main(args: Array<String>) {
    val arr = intArrayOf(2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2)
    val n = arr.size
    println(getOddOccurrence(arr, n))
}