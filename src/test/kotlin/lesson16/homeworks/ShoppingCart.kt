package lesson16.homeworks

class ShoppingCart {
    private val items = mutableMapOf<Int, Int>()
    
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }
    
    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }
    
    fun addToCart(itemsMap: Map<Int, Int>) {
        for ((id, amount) in itemsMap) {
            items[id] = items.getOrDefault(id, 0) + amount
        }
    }
    
    fun addToCart(itemIds: List<Int>) {
        for (id in itemIds) {
            items[id] = items.getOrDefault(id, 0) + 1
        }
    }
    
    override fun toString(): String {
        if (items.isEmpty()) {
            return "Корзина пуста"
        }
        
        val result = StringBuilder()
        result.appendLine("Корзина:")
        result.appendLine("ID товара | Количество")
        result.appendLine("------------------------")
        
        for ((id, quantity) in items) {
            result.appendLine("  $id       |    $quantity")
        }
        
        result.appendLine("------------------------")
        result.appendLine("Артикулов: ${items.size}")
        result.appendLine("Всего товаров: ${items.values.sum()}")
        
        return result.toString()
    }
}
