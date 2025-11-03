package lesson16.homeworks

class Bird : Animal() {
    override fun makeSound() {
        println("${Colors.BLUE}Tweet${Colors.RESET}")
    }
}
