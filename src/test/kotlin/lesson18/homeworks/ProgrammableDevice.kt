package lesson18.homeworks

abstract class ProgrammableDevice : PowerableDevice(), Programmable {
    private var programmedAction: String = ""
    
    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("Невозможно запрограммировать устройство - оно выключено")
            return
        }
        programmedAction = action
        println("Действие '$action' запрограммировано")
    }
    
    override fun execute() {
        if (!isPoweredOn) {
            println("Невозможно выполнить программу - устройство выключено")
            return
        }
        println("Выполняется действие: $programmedAction")
    }
}
