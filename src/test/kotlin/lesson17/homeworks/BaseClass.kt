package lesson17.homeworks

abstract class BaseClass(
    private val privateVal: String,
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "публичное поле"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "защищенное поле"
    private var privateField = "приватное поле"
    
    fun setPrivateField(value: String) {
        privateField = value
    }
    
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }
    
    fun printText() {
        privatePrint()
    }
    
    protected open fun getProtectedClass() = ProtectedClass()
    
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 100
    }
    
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }
    
    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }
    
    private fun getPrivateClass() = PrivateClass()
    
    protected class ProtectedClass()
    
    private class PrivateClass()
}
