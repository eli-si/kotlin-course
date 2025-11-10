package lesson18.homeworks

class WashingMachineDevice : TemperatureRegulatedDevice(), WaterConnection, Drainable {
    override val maxTemperature = 95
    
    override fun connectToWaterSupply() {
        println("Подключение к водопроводу")
    }
    
    override fun getWater(amount: Int) {
        println("Набираем $amount литров воды")
    }
    
    override fun connectToDrain() {
        println("Подключение к канализации")
    }
    
    override fun drain() {
        println("Сливаем воду")
    }
}
