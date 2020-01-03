class Bottles {
    fun verse(num: Int): String {
        return """
        |99 bottles of beer on the wall, 99 bottles of beer.
        |Take one down and pass it around, 98 bottles of beer on the wall.
        |""".trimMargin()
    }

    fun verses(from: Int, to: Int): String {
        return (from + to).toString()
    }

    fun song() = ""
}