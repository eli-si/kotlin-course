package lesson16.homeworks

class Cat : Animal() {
    override fun makeSound() {
        println("${Colors.CYAN}Meow${Colors.RESET}")
    }
}
