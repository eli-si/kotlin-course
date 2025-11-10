package lesson17.homeworks

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    
    override fun verifyPublicField(value: String): Boolean {
        return true
    }
    
    fun updateProtectedField(value: String) {
        protectedField = value
    }
    
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}
