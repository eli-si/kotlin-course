package lesson16.homeworks

class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        Colors.RED to Colors.BG_YELLOW,
        Colors.GREEN to Colors.BG_PURPLE,
        Colors.BLUE to Colors.BG_CYAN,
        Colors.YELLOW to Colors.BG_BLUE,
        Colors.PURPLE to Colors.BG_GREEN,
        Colors.CYAN to Colors.BG_RED
    )
    
    override fun print(text: String) {
        val words = text.split(" ")
        for (i in words.indices) {
            val word = words[i]
            val (textColor, bgColor) = colorPairs[i % colorPairs.size]
            println("$bgColor$textColor$word${Colors.RESET}")
        }
    }
}
