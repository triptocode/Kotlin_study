package com.example.kotlinstudy01

    fun main(){
        var a: Int
        println(a)

        var b: Int = 1
        println(b)

//  고전적 언어들은 변수가 선언된후,
//  변수가 초기화되지 않으면 기본값으로 초기화되거나, null 값을 가지게 되는데

// Kotlind은 기본변수에서 null을 허용하지 않으며 변수에 값을 할당하지 않은 상태로 사용하게되면
// 문법에러를 표시하고 컴파일을 막아주므로 의도하지 않은 동작이나 NPE을 차단해줌


        var c: Int? = null
    // 자료형 뒤에 ? 를 붙여 nullable 변수로 선언 가능
    // ( 값이 할당되지 않았음을 하나의 정보로 활용하고 싶을때 )
        // 값이 null인상태로 연산하면 NPE가 발생할수 있으니 주의하며 사용해야한다.

    }

