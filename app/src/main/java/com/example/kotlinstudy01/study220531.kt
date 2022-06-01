package com.example.kotlinstudy01

fun main(){
    helloWorld()
}

// 1. 함수
// 자바는 리턴형 void, int 등을 앞에 적어주었다면
// 코틀린은 항상 fun 을 적어주고 리턴형이 무엇이든 Unit을 적거나 생략가능
fun helloWorld() : Unit {
    println("Welcome to Kotlin")
}
// 위 코틀린코드에서 파라미터가 없어서 (), 리턴형도 없어서 {} 으로
// fun helloWolrd(){} 이렇게 작성하거나 fun helloWorld(): Unit {} 도 작성가능

