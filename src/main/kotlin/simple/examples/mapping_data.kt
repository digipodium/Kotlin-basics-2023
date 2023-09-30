package simple.examples

import kotlin.math.roundToInt

fun main() {
    val movies = movieList()

    val ratings = movies.map {
        it.rating
    }
    println("Average rating")
    println(ratings.average().roundToInt())
}