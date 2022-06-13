package com.example.kotlinstudy01


fun main() {
    var x: Int = 1
    var b: Long = x  // 타입이 다른경우 값을 할당할수 없다

    var y: Int = 2
    var c: Long = y.toLong()   // 타입이 달라서 int였던 y를 Long으로 type casting

    println(x)
    println(y)

}