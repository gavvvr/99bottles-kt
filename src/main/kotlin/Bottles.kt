class Bottles {
    fun verse(num: Int): String {
        val firstSentence = "$num bottle${if (num == 1) "" else "s"} of beer on the wall, $num bottle${if (num == 1) "" else "s"} of beer."
        val secondSentence: String = when (num) {
            1 -> "Take it down and pass it around, no more bottles of beer on the wall.\n"
            0 -> "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
            else -> "Take one down and pass it around, ${num - 1} bottle${if (num == 2) "" else "s"} of beer on the wall.\n"
        }
        return firstSentence + System.lineSeparator() + secondSentence
    }

    fun verses(from: Int, to: Int): String {
        return (from + to).toString()
    }

    fun song() = ""
}