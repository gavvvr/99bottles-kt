class Item(var number: Int, private val containerType: String, private val substance: String, private val location: String){
    fun status(withLocation: Boolean): String {
        val quantity = when (number) {
            0 -> "no more"
            else -> number.toString()
        }
        val type = if (number != 1) makePlural(containerType) else containerType
        val evaluatedLocation = if (withLocation) " $location" else ""
        return "$quantity $type of $substance$evaluatedLocation"
    }

    private fun makePlural(word: String): String {
        return word + 's'
    }
}

class Bottles {

    private val versesSeparator = System.lineSeparator()

    fun verse(num: Int): String {
        val item = Item(num, "bottle", "beer", "on the wall")

        val initialSentence = "${item.status(true).capitalize()}, ${item.status(false)}."
        val whatToDo: String
        if (num == 0) {
            whatToDo = buy()
            item.number = 99
        } else {
            whatToDo = take(num == 1)
            item.number--
        }
        val actionSentence = "$whatToDo, ${item.status(true)}."
        return "$initialSentence\n$actionSentence\n"
    }

    private fun take(last: Boolean): String {
        val takeWhat = if (last) "it" else "one"
        return "Take $takeWhat down and pass it around"
    }

    private fun buy():String {
        return "Go to the store and buy some more"
    }

    fun verses(from: Int, to: Int): String {
        return (from downTo to).joinToString(versesSeparator) { verse(it) }
    }

    fun song() = verses(99, 0)
}