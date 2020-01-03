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

    fun verses(from: Int, to: Int): String {
        val item = Item(from, "bottle", "beer", "on the wall")
        return (from downTo to).joinToString(versesSeparator) { verse(it, item) }
    }

    fun verse(num: Int, item: Item = Item(num, "bottle", "beer", "on the wall")): String {
        return makeVerse(item)
    }

    private fun makeVerse(item: Item): String {
        val initialSentence = "${item.status(true).capitalize()}, ${item.status(false)}."
        val whatToDo: String
        if (item.number == 0) {
            whatToDo = buy()
            item.number = 99
        } else {
            whatToDo = take(item.number == 1)
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

    fun song() = verses(99, 0)

}
