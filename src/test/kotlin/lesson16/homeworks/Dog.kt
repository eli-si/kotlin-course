package lesson16.homeworks

class Dog : Animal() {
    override fun makeSound() {
        println("${Colors.YELLOW}Bark${Colors.RESET}")
    }
}
