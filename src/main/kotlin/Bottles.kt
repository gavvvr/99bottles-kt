class Bottles {
    fun verse(num: Int): String {
        return """$num bottles of beer on the wall, $num bottles of beer.
Take one down and pass it around, ${num - 1} bottle${if (num == 2) "" else "s"} of beer on the wall.
"""
    }

    fun verses(from: Int, to: Int): String {
        return (from + to).toString()
    }

    fun song() = ""
}