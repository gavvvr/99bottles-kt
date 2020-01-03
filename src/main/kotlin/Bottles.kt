class Bottles {

    fun song() = verses(99, 0)

    fun verses(starting: Int, ending: Int) = starting.downTo(ending).joinToString("\n") { verse(it) }

    fun verse(number: Int): String {
        return when (number) {
            0 -> """
            |No more bottles of beer on the wall, no more bottles of beer.
            |Go to the store and buy some more, 99 bottles of beer on the wall.
            |""".trimMargin()
            1 -> """
            |1 bottle of beer on the wall, 1 bottle of beer.
            |Take it down and pass it around, no more bottles of beer on the wall.
            |""".trimMargin()
            2 -> """
            |2 bottles of beer on the wall, 2 bottles of beer.
            |Take one down and pass it around, 1 bottle of beer on the wall.
            |""".trimMargin()
            else -> """
            |$number bottles of beer on the wall, $number bottles of beer.
            |Take one down and pass it around, ${number - 1} bottles of beer on the wall.
            |""".trimMargin()
        }
    }
}
