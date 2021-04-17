package org.fpeterek.elp

val Int.square
    get() = this * this

fun transform(list: List<Int>) = 
    list.filter { it % 2 == 0 }
        .associate { it to it.square }

fun main() {
    val map = transform(listOf(1, 2, 3, 4, 5, 6, 7, 8))

    map.forEach { (key, value) ->
        println("The square of $key is $value")
    }
}

