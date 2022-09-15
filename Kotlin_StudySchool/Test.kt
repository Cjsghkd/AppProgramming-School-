package com.example.kotlin_studyschool

class Test {

}

// var, val
//val date1 = 10
//var date2 = 10

//문자열
//val str1 = "hello \n world"
//var str2 = """Hello
//       Wolrd""".trimIndent()

//배열
//val detal : Array<Int> = Array(3, {0})

//리스트
//var list = listOf<Int>(10, 20, 30)

//조건문
//var date = 10
//var data = 10


//반복문
//var sum : Int = 0
//var data = arrayOf<Int>(10, 20, 30)
var x = 0
var sum1 = 0


fun main() {

//    println("hello kotlin")

//    date1 + 20 // 오류
//    date2 + 20 // 성공

//    println("str1 : $str1")
//    println("str2 : $str2")

//    detal[0] = 10
//    detal[1] = 20
//    detal.set(2, 30)
//
//    println(
//        """
//            array size : ${detal.size}
//            array data : ${detal[1]}, ${detal.get(2)}
//        """.trimIndent()
//    )

//    println(
//        """
//            list size : ${list.size}
//            list date : ${list[0]}, ${list.get(1)}, ${list.get(2)}
//        """.trimIndent()
//    )

//    if (date > 0) {
//        println("date > 0")
//    } else {
//        println("date <= 0")
//    }

//    if (data > 10) {
//        println("data > 10")
//    } else if (data >0 && data <= 10) {
//        println("data > 0 && data <= 10")
//    } else {
//        println("data <= 0")
//    }

//    val result = if (data > 0) {
//        println("data > 0")
//        true  // 변환값
//    } else {
//        println("data <= 0")
//        false
//    }
//    println(result)

//    when(data) {
//        10 -> println("data is 10")
//        20 -> println("data is 20")
//        else -> {
//            println("data is not valid data")
//        }
//    }

//    var data : Any = 10
//    when(data) {
//        is String -> println("data is String")  // data가 문자열 타입이면 출력
//        20, 30 -> println("data is 20 or 30")  // data가 20 또는 30이면 출력
//        in 1..10 -> println("data is 1..10")  // data가 1 ~ 10이면 출력
//        else -> println("data is not valid")
//    }

//    for (i in 1..10) {
//        sum += 1
//    }
//    println(sum)

//    for (i in data.indices) {
//        print(data[i])
//        if (i != data.size - 1) print(",")
//    }

//    while (x < 10) {
//        sum1 += ++x
//    }
//    println(sum1)

    var x = 0
    for(i in 1..5){
        for(j in i..4){
            print(" ")
        }
        for(j in 1 until i * 2){
            print("*")
        }
        println()
    }
}