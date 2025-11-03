package lesson16.homeworks

class Logger {
    
    fun log(message: String) {
        println("[INFO] $message")
    }
    
    fun log(level: LogLevel, message: String) {
        when (level) {
            LogLevel.INFO -> println("[INFO] $message")
            LogLevel.WARNING -> println("${Colors.YELLOW}[WARNING] $message${Colors.RESET}")
            LogLevel.ERROR -> println("${Colors.BG_RED}${Colors.WHITE}[ERROR] $message${Colors.RESET}")
            LogLevel.DEBUG -> println("${Colors.PURPLE}[DEBUG] $message${Colors.RESET}")
        }
    }
    
    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }
    
    fun log(exception: Exception) {
        log(LogLevel.ERROR, exception.message ?: "Unknown error")
    }
}
