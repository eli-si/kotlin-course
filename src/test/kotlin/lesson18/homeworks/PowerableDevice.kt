package lesson18.homeworks

abstract class PowerableDevice : Powerable {
    protected var isPoweredOn = false
    
    override fun powerOn() {
        isPoweredOn = true
        println("Устройство включено")
    }
    
    override fun powerOff() {
        isPoweredOn = false
        println("Устройство выключено")
    }
}
