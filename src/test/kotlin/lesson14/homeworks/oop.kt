package lesson14.homeworks



// Задание 1: Party
/**
 * Класс, описывающий вечеринку
 */
class Party(
    val location: String,
    val attendees: Int
) {

    fun details() {
        println("Вечеринка проходит в: $location")
        println("Количество гостей: $attendees")
    }
}

// Задание 2: Emotion

class Emotion(
    val type: String,
    val intensity: Int
) {
    /**
     * Выводит описание эмоции в зависимости от её типа и интенсивности
     */
    fun express() {
        val intensityLevel = when {
            intensity <= 3 -> "слабая"
            intensity <= 7 -> "средняя"
            else -> "сильная"
        }

        println("Эмоция: $type, интенсивность: $intensityLevel ($intensity/10)")
    }
}

// Задание 3: Moon

object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    /**
     * Выводит текущую фазу Луны
     */
    fun showPhase() {
        if (isVisible) {
            println("Текущая фаза Луны: $phase")
        } else {
            println("Луна в данный момент не видна")
        }
    }
}

// Задание 4: Product

data class Product(
    val название: String,
    val цена: Double,
    val количество: Int
)

// Задание 5: Concert

class Concert(
    val группа: String,
    val местоПроведения: String,
    val стоимость: Double,
    val вместимостьЗала: Int
) {
    private var проданныеБилеты: Int = 0


    fun info() {
        println("=== Информация о концерте ===")
        println("Группа: $группа")
        println("Место проведения: $местоПроведения")
        println("Стоимость билета: $стоимость руб.")
        println("Вместимость зала: $вместимостьЗала")
        println("Продано билетов: $проданныеБилеты")
        println("Доступно билетов: ${вместимостьЗала - проданныеБилеты}")
    }


    fun купитьБилет() {
        if (проданныеБилеты < вместимостьЗала) {
            проданныеБилеты++
            println("Билет успешно куплен! Продано билетов: $проданныеБилеты")
        } else {
            println("К сожалению, все билеты распроданы!")
        }
    }
}

// Задание 6: Shelf

class Shelf(
    val capacity: Int
) {
    private val items = mutableListOf<String>()


    private fun getCurrentLoad(): Int {
        return items.sumOf { it.length }
    }


    fun addItem(itemName: String): Boolean {
        if (canAccommodate(itemName)) {
            items.add(itemName)
            return true
        }
        return false
    }


    fun removeItem(itemName: String): Boolean {
        return items.remove(itemName)
    }


    fun canAccommodate(itemName: String): Boolean {
        return getCurrentLoad() + itemName.length <= capacity
    }


    fun containsItem(itemName: String): Boolean {
        return items.contains(itemName)
    }


    fun getItems(): List<String> {
        return items.toList()
    }


    fun getRemainingCapacity(): Int {
        return capacity - getCurrentLoad()
    }
}

// Задание 6: Rack

class Rack(
    private val maxShelves: Int
) {
    private val shelves = mutableListOf<Shelf>()


    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves) {
            return false
        }
        if (shelves.contains(shelf)) {
            return false
        }
        shelves.add(shelf)
        return true
    }


    fun removeShelf(index: Int): List<String> {
        if (index < 0 || index >= shelves.size) {
            return emptyList()
        }
        val removedShelf = shelves.removeAt(index)
        return removedShelf.getItems()
    }


    fun addItem(itemName: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(itemName)) {
                return true
            }
        }
        return false
    }


    fun removeItem(itemName: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(itemName)) {
                return true
            }
        }
        return false
    }


    fun containsItem(itemName: String): Boolean {
        return shelves.any { it.containsItem(itemName) }
    }


    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }


    fun printContents() {
        println("Содержимое стеллажа")
        println("Количество полок: ${shelves.size}/$maxShelves")
        println()

        if (shelves.isEmpty()) {
            println("Стеллаж пуст")
            return
        }

        shelves.forEachIndexed { index, shelf ->
            println("Полка #$index:")
            println("  Вместимость: ${shelf.capacity}")
            println("  Занято: ${shelf.capacity - shelf.getRemainingCapacity()}")
            println("  Свободно: ${shelf.getRemainingCapacity()}")
            println("  Предметы: ${shelf.getItems().joinToString(", ")}")
            println()
        }
    }


    fun advancedRemoveShelf(index: Int): List<String> {
        if (index < 0 || index >= shelves.size) {
            return emptyList()
        }

        // Получаем предметы с удаляемой полки
        val itemsToRedistribute = shelves[index].getItems().toMutableList()

        // Удаляем полку
        shelves.removeAt(index)

        // Сортируем предметы по длине (от самых длинных к самым коротким)
        itemsToRedistribute.sortByDescending { it.length }

        // Список предметов, которые не удалось разместить
        val unplacedItems = mutableListOf<String>()

        // Пытаемся разместить каждый предмет
        for (item in itemsToRedistribute) {
            var placed = false
            for (shelf in shelves) {
                if (shelf.addItem(item)) {
                    placed = true
                    break
                }
            }
            if (!placed) {
                unplacedItems.add(item)
            }
        }

        return unplacedItems.toList()
    }
}

// Main для тестирования
fun main() {
    println("Задание 1: Party")
    val party = Party("Ресторан 'Огни'", 50)
    party.details()
    println()

    println("=== Задание 2: Emotion ===")
    val emotion1 = Emotion("Радость", 9)
    emotion1.express()

    val emotion2 = Emotion("Грусть", 4)
    emotion2.express()
    println()

    println("Задание 3: Moon")
    Moon.phase = "Full Moon"
    Moon.isVisible = true
    Moon.showPhase()

    Moon.isVisible = false
    Moon.showPhase()
    println()

    println("Задание 4: Product")
    val product1 = Product("Ноутбук", 75000.0, 5)
    val product2 = Product("Мышь", 1500.0, 20)
    println(product1)
    println(product2)
    println()

    println("Задание 5: Concert")
    val concert = Concert(
        группа = "Imagine Dragons",
        местоПроведения = "Олимпийский",
        стоимость = 3500.0,
        вместимостьЗала = 100
    )
    concert.info()
    println()
    concert.купитьБилет()
    concert.купитьБилет()
    concert.купитьБилет()
    println()
    concert.info()
    println()

    println("Задание 6: Rack и Shelf")
    // Создаем стеллаж на 3 полки
    val rack = Rack(maxShelves = 3)

    // Создаем полки с разной вместимостью
    val shelf1 = Shelf(capacity = 20)
    val shelf2 = Shelf(capacity = 15)
    val shelf3 = Shelf(capacity = 10)

    // Добавляем полки в стеллаж
    rack.addShelf(shelf1)
    rack.addShelf(shelf2)
    rack.addShelf(shelf3)

    // Добавляем предметы
    rack.addItem("Книга")
    rack.addItem("Тетрадь")
    rack.addItem("Карандаш")
    rack.addItem("Ручка")
    rack.addItem("Альбом")

    // Выводим содержимое стеллажа
    rack.printContents()

    // Проверяем наличие предмета
    println("Есть ли 'Книга'? ${rack.containsItem("Книга")}")
    println("Есть ли 'Телефон'? ${rack.containsItem("Телефон")}")
    println()

    // Удаляем предмет
    rack.removeItem("Ручка")
    println("После удаления 'Ручка':")
    rack.printContents()

    // Сложное удаление полки с перераспределением
    println("Выполняем сложное удаление полки #1:")
    val unplacedItems = rack.advancedRemoveShelf(1)
    println("Не удалось разместить: $unplacedItems")
    println()
    rack.printContents()
}