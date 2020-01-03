class Bottles {
    fun verse(num: Int): String {
        return """
        |$num bottles of beer on the wall, $num bottles of beer.
        |Take one down and pass it around, ${num - 1} bottles of beer on the wall.
        |""".trimMargin()
    }

    fun verses(from: Int, to: Int): String {
        return (from + to).toString()
    }

    fun song() = ""
}