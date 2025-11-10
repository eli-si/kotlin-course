package lesson18.homeworks

abstract class TemperatureRegulatedDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {
    protected var currentTemperature = 0
    protected var isOpen = false
    
    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Невозможно установить температуру - устройство выключено")
            return
        }
        if (temp > maxTemperature) {
            println("Температура $temp превышает максимум $maxTemperature")
            return
        }
        currentTemperature = temp
        println("Температура установлена на $temp градусов")
    }
    
    override fun open() {
        isOpen = true
        println("Устройство открыто")
    }
    
    override fun close() {
        isOpen = false
        println("Устройство закрыто")
    }
}
