package demo

import java.io.File

fun main(args : Array<String>) {
//    doWhenCondition(1)
//    println(factorial(6))

    File("/Users/gibber/Desktop/waterdata.usgs.gov.txt")
        .readLines()
        .drop(36).take(12)
        .map{ it.split(delimiters = "\t") }
        .map{ GroundwaterSiteRecord(it[2], it[4].toInt(), it[5].toFloat()) }
        .forEach { println(it) }
}

data class GroundwaterSiteRecord(
        val siteId: String,
        val year: Int,
        val depth: Float
)




fun factorial(start: Int): Int {
    return when {
        start < 2 -> 1
        else -> factorial(start - 1) * start
    }
}


fun doWhenCondition(age: Int = 8) {
    return when (age) {
        0,1,2 -> println("Go to preschool")
        else -> println("Go elsewhere")
    }
}

