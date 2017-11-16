package demo

import java.io.File

fun main(args : Array<String>) {
    File("src/data/waterdata.usgs.gov.txt")
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
