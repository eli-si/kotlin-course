package lesson18.homeworks

class Kettle : TemperatureRegulatedDevice(), WaterContainer, AutomaticShutdown {
    override val maxTemperature = 100
    override val capacity = 2000
    override val sensorType = "Температурный"
    override val maxSensoredValue = 100
    
    private var waterAmount = 0
    
    override fun fillWater(amount: Int) {
        if (waterAmount + amount <= capacity) {
            waterAmount += amount
            println("Налили $amount мл воды. Всего: $waterAmount мл")
        } else {
            println("Слишком много воды")
        }
    }
    
    override fun getWater(amount: Int) {
        if (waterAmount >= amount) {
            waterAmount -= amount
            println("Вылили $amount мл воды")
        } else {
            println("Недостаточно воды")
        }
    }
    
    override fun startMonitoring() {
        println("Мониторинг температуры запущен")
    }
}
