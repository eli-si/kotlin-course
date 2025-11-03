package lesson16.homeworks

fun main() {
    
    println("Задание 1: Животные")
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())
    for (animal in animals) {
        animal.makeSound()
    }
    
    println("\nЗадание 2: Фигуры")
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0, 90.0)
    )
    for (shape in shapes) {
        println("${shape.javaClass.simpleName}: ${shape.area()}")
    }
    
    println("\nЗадание 3: Принтеры")
    val laser = LaserPrinter()
    val inkjet = InkjetPrinter()
    
    println("Лазерный:")
    laser.print("Hello world")
    
    println("\nСтруйный:")
    inkjet.print("Kotlin programming language is very cool and modern")
    
    println("\nЗадание 4: Корзина")
    val cart = ShoppingCart()
    cart.addToCart(101)
    cart.addToCart(102, 5)
    cart.addToCart(mapOf(103 to 3, 104 to 2))
    cart.addToCart(listOf(105, 106, 105, 107))
    println(cart)
    
    println("\nЗадание 5: Логгер")
    val logger = Logger()
    logger.log("Приложение запущено")
    logger.log(LogLevel.WARNING, "Низкая память")
    logger.log(LogLevel.ERROR, "Ошибка подключения")
    logger.log(listOf("Сообщение 1", "Сообщение 2", "Сообщение 3"))
    
    try {
        throw Exception("Критическая ошибка")
    } catch (e: Exception) {
        logger.log(e)
    }
}
