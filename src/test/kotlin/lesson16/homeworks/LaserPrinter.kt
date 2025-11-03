package lesson16.homeworks

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            println("${Colors.BG_WHITE}${Colors.BLACK}$word${Colors.RESET}")
        }
    }
}
