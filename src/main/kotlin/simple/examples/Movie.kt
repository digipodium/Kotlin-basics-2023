package simple.examples

data class Movie(
    val title: String,
    val year: Int,
    val rating: Float,
    val genre: String,
)

fun movieList() = listOf(
    Movie("The Godfather", 1972, 9.2f, "Crime, Drama"),
    Movie("The Shawshank Redemption", 1994, 9.3f, "Drama"),
    Movie("The Dark Knight", 2008, 9.0f, "Action, Crime, Drama"),
    Movie("Inception", 2010, 8.8f, "Action, Adventure, Sci-Fi"),
    Movie("Pulp Fiction", 1994, 8.9f, "Crime, Drama"),
    Movie("Fight Club", 1999, 8.8f, "Drama"),
    Movie("Forrest Gump", 1994, 8.8f, "Drama, Romance"),
    Movie("The Matrix", 1999, 8.7f, "Action, Sci-Fi"),
    Movie(
        "The Lord of the Rings: The Fellowship of the Ring",
        2001, 8.8f, "Action, Adventure, Drama"
    ),
    Movie(
        "The Lord of the Rings: The Return of the King",
        2003, 8.9f, "Action, Adventure, Drama"
    ),
)

fun main() {
    // display all the movie names
    val movies = movieList()
    movies.forEachIndexed { index, movie ->
        println("#${index + 1} ${movie.title}")
    }
}