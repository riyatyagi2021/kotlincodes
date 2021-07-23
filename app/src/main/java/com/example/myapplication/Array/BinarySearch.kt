package com.example.myapplication.Array


fun main(args: Array<String>) {
    val arr = intArrayOf(10, 20, 30, 40, 50)
    val key = 30
    val last = arr.size - 1
    binarySearch(arr, 0, last, key)
}


fun binarySearch(arr: IntArray, first: Int, last: Int, key: Int) {
    var first = first
    var last = last
    var mid = (first + last) / 2
    while (first <= last) {
        if (arr[mid] < key) {
            first = mid + 1
        } else if (arr[mid] == key) {
            println("Element is found at index: $mid")
            break
        } else {
            last = mid - 1
        }
        mid = (first + last) / 2
    }
    if (first > last) {
        println("Element is not found!")
    }
}