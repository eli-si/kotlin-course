package lesson17.homeworks

fun main() {
    println(" Тестирование игрового автомата ")
    val machine = GameMachine(
        color = "Красный",
        model = "SuperGame 3000",
        hasJoystick = true,
        supportPhone = "+7-999-123-45-67",
        sessionCost = 50.0
    )
    
    machine.powerOn()
    machine.showGames()
    machine.paySession()
    machine.startGame("Pac-Man")
    machine.powerOff()
    
    println("\n Тестирование почемучки ")
    val child = ChildrenClass("private", "protected", "public")
    
    println("\nДо изменений:")
    println(child.getAll())
    
    child.publicField = "Антонио Бандерас"
    child.updateProtectedField("Измененное защищенное поле")
    child.setPrivateField("Измененное приватное поле")
    
    println("\nПосле изменений:")
    println(child.getAll())
    
    println("\nТест printText():")
    child.printText()
    
    println("\nДоступ к полям:")
    println("privateVal из child: ${child.privateVal}")
    println("publicVal из child: ${child.publicVal}")
}
