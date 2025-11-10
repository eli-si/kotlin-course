package lesson17.homeworks

class GameMachine(
    val color: String,
    val model: String,
    val hasJoystick: Boolean,
    val supportPhone: String,
    val sessionCost: Double
) {
    private var isOn = false
    private var isOsLoaded = false
    private val installedGames = mutableListOf<String>()
    private var balance = 0.0
    private val owner = "Владелец"
    private var isSessionPaid = false
    private val pinCode = "1234"
    
    fun powerOn() {
        isOn = true
        println("Автомат включен")
        loadOs()
    }
    
    fun powerOff() {
        shutdownOs()
        isOn = false
        println("Автомат выключен")
    }
    
    private fun loadOs() {
        isOsLoaded = true
        println("ОС загружена")
    }
    
    private fun shutdownOs() {
        isOsLoaded = false
        println("ОС завершила работу")
    }
    
    fun showGames() {
        if (isOsLoaded) {
            println("Доступные игры: ${installedGames.joinToString()}")
        } else {
            println("Автомат выключен")
        }
    }
    
    fun startGame(gameName: String) {
        if (!isOsLoaded) {
            println("Автомат выключен")
            return
        }
        if (!isSessionPaid) {
            println("Оплатите сеанс")
            return
        }
        if (gameName in installedGames) {
            println("Запуск игры $gameName")
        } else {
            println("Игра не найдена")
        }
    }
    
    fun paySession() {
        balance += sessionCost
        isSessionPaid = true
        println("Сеанс оплачен. Стоимость: $sessionCost")
    }
    
    private fun collectCash(pin: String): Boolean {
        if (pin == pinCode) {
            openSafe()
            return true
        }
        println("Неверный пин-код")
        return false
    }
    
    private fun openSafe() {
        println("Сейф открыт. Выдано $balance")
        balance = 0.0
    }
}
