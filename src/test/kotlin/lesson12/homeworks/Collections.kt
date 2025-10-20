package lesson12.homeworks



fun main() {


    // Задача 1: Проверить, что размер коллекции больше 5 элементов
    val collection1 = listOf(1, 2, 3, 4, 5, 6, 7)
    val isLargerThan5 = collection1.size > 5
    println("1. Размер коллекции больше 5: $isLargerThan5")

    // Задача 2: Проверить, что коллекция пустая
    val collection2 = listOf<Int>()
    val isEmptyCheck = collection2.isEmpty()
    println("2. Коллекция пустая: $isEmptyCheck")

    // Задача 3: Проверить, что коллекция не пустая
    val collection3 = listOf(10, 20, 30)
    val isNotEmptyCheck = collection3.isNotEmpty()
    println("3. Коллекция не пустая: $isNotEmptyCheck")

    // Задача 4: Взять элемент по индексу или создать значение
    val collection4 = listOf(100, 200, 300)
    val element = collection4.getOrElse(10) { -1 }
    println("4. Элемент по индексу 10 или значение по умолчанию: $element")

    // Задача 5: Собрать коллекцию в строку
    val collection5 = listOf("Kotlin", "Java", "Python")
    val joinedString = collection5.joinToString(separator = ", ")
    println("5. Коллекция в строку: $joinedString")

    // Задача 6: Посчитать сумму всех значений
    val collection6 = listOf(5, 10, 15, 20)
    val totalSum = collection6.sum()
    println("6. Сумма всех значений: $totalSum")

    // Задача 7: Посчитать среднее
    val collection7 = listOf(10, 20, 30, 40)
    val averageValue = collection7.average()
    println("7. Среднее значение: $averageValue")

    // Задача 8: Взять максимальное число
    val collection8 = listOf(45, 23, 78, 12, 90)
    val maxNumber = collection8.maxOrNull()
    println("8. Максимальное число: $maxNumber")

    // Задача 9: Взять минимальное число
    val collection9 = listOf(45, 23, 78, 12, 90)
    val minNumber = collection9.minOrNull()
    println("9. Минимальное число: $minNumber")

    // Задача 10: Взять первое число или null
    val collection10 = listOf(100, 200, 300)
    val firstNumber = collection10.firstOrNull()
    println("10. Первое число или null: $firstNumber")

    // Задача 11: Проверить что коллекция содержит элемент
    val collection11 = listOf(1, 2, 3, 4, 5)
    val containsElement = collection11.contains(3)
    println("11. Коллекция содержит элемент 3: $containsElement")

    println("\n=== ЗАДАЧИ НА ОБРАБОТКУ КОЛЛЕКЦИЙ ===\n")

    // Задача 12: Отфильтровать коллекцию по диапазону 18-30
    val ages = listOf(15, 22, 35, 18, 29, 40, 25, 17, 30)
    val filteredAges = ages.filter { it in 18..30 }
    println("12. Возраста в диапазоне 18-30: $filteredAges")

    // Задача 13: Выбрать числа, которые не делятся на 2 и 3 одновременно
    val numbers13 = listOf(6, 7, 8, 9, 10, 12, 13, 15, 18)
    val notDivisibleBy2And3 = numbers13.filterNot { it % 2 == 0 && it % 3 == 0 }
    println("13. Числа, не делящиеся на 2 и 3 одновременно: $notDivisibleBy2And3")

    // Задача 14: Очистить текстовую коллекцию от null элементов
    val textCollection = listOf("Kotlin", null, "Java", "Python", null, "Swift")
    val cleanedCollection = textCollection.filterNotNull()
    println("14. Коллекция без null: $cleanedCollection")

    // Задача 15: Преобразовать текстовую коллекцию в коллекцию длин слов
    val words = listOf("apple", "banana", "cherry", "date")
    val wordLengths = words.map { it.length }
    println("15. Длины слов: $wordLengths")

    // Задача 16: Преобразовать текстовую коллекцию в мапу
    val words16 = listOf("hello", "world", "kotlin")
    val wordMap = words16.associate { it.reversed() to it.length }
    println("16. Мапа (перевёрнутое слово -> длина): $wordMap")

    // Задача 17: Отсортировать список в алфавитном порядке
    val unsortedList = listOf("banana", "apple", "cherry", "date")
    val sortedList = unsortedList.sorted()
    println("17. Отсортированный список: $sortedList")

    // Задача 18: Взять первые 3 элемента списка
    val numbers18 = listOf(10, 20, 30, 40, 50, 60)
    val firstThree = numbers18.take(3)
    println("18. Первые 3 элемента: $firstThree")

    // Задача 19: Распечатать квадраты элементов списка
    val numbers19 = listOf(1, 2, 3, 4, 5)
    print("19. Квадраты элементов: ")
    numbers19.forEach { print("${it * it} ") }
    println()

    // Задача 20: Группировать список по первой букве слов
    val fruits = listOf("apple", "apricot", "banana", "blueberry", "cherry")
    val groupedByLetter = fruits.groupBy { it.first() }
    println("20. Группировка по первой букве: $groupedByLetter")

    // Задача 21: Очистить список от дублей
    val duplicates = listOf(1, 2, 2, 3, 4, 4, 5, 5, 5)
    val uniqueNumbers = duplicates.distinct()
    println("21. Список без дублей: $uniqueNumbers")

    // Задача 22: Отсортировать список по убыванию
    val numbers22 = listOf(45, 23, 78, 12, 90, 34)
    val descendingList = numbers22.sortedDescending()
    println("22. Список по убыванию: $descendingList")

    // Задача 23: Взять последние 3 элемента списка
    val numbers23 = listOf(10, 20, 30, 40, 50, 60)
    val lastThree = numbers23.takeLast(3)
    println("23. Последние 3 элемента: $lastThree")

    println("Задачи в отдельных функциях")

    // Задача 24: Характеристика числовой коллекции
    println("24. Характеристика числовой коллекции:")
    println("   Пустая: ${characterizeCollection(listOf())}")
    println("   Короткая: ${characterizeCollection(listOf(1, 2, 3))}")
    println("   Стартовая: ${characterizeCollection(listOf(0, 5, 10))}")
    println("   Массивная: ${characterizeCollection(listOf(2000, 3000, 6000))}")
    println("   Сбалансированная: ${characterizeCollection(listOf(10, 10, 10, 10, 10))}")
    println("   Клейкая: ${characterizeCollection(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))}")
    println("   Отрицательная: ${characterizeCollection(listOf(-20, -15, -11))}")
    println("   Положительная: ${characterizeCollection(listOf(1001, 2000, 3000))}")
    println("   Пи***тая: ${characterizeCollection(listOf(3, 14, 5, 8))}")
    println("   Уникальная: ${characterizeCollection(listOf(7, 8, 9))}")

    // Задача 25: Анализ учебных оценок
    println("\n25. Анализ учебных оценок:")
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val topGrades = analyzeGrades(grades)
    println("   Топ-3 удовлетворительные оценки: $topGrades")

    // Задача 26: Создание каталога по первой букве
    println("\n26. Создание каталога по первой букве:")
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба",
        "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    val catalog = createCatalog(list)
    catalog.forEach { (letter, items) ->
        println("   $letter: ${items.take(3)}...") // Показываем только первые 3 для краткости
    }

    // Задача 27: Подсчёт средней длины слов в списке
    println("\n27. Подсчёт средней длины слов:")
    val averageLength = calculateAverageWordLength(list)
    println("   $averageLength")

    // Задача 28: Категоризация чисел
    println("\n28. Категоризация чисел:")
    val numbers28 = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val categorized = categorizeNumbers(numbers28)
    println("   $categorized")

    // Задача 29: Поиск первого подходящего элемента
    println("\n29. Поиск первого подходящего возраста:")
    val ages29 = listOf(22, 18, 30, 45, 17, null, 60)
    val firstSuitableAge = findFirstSuitableAge(ages29, 18)
    println("   Первый возраст больше 18: $firstSuitableAge")

    println("Все задачи выполнены")
}

// Задача 24: Характеристика числовой коллекции
fun characterizeCollection(collection: List<Int>): String {
    return when {
        collection.isEmpty() -> "Пусто"
        collection.size < 5 -> "Короткая"
        collection.firstOrNull() == 0 -> "Стартовая"
        collection.sum() > 10000 -> "Массивная"
        collection.average() == 10.0 -> "Сбалансированная"
        collection.joinToString("").length == 20 -> "Клейкая"
        (collection.maxOrNull() ?: 0) < -10 -> "Отрицательная"
        (collection.minOrNull() ?: 0) > 1000 -> "Положительная"
        collection.contains(3) && collection.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

// Задача 25: Анализ учебных оценок
fun analyzeGrades(grades: List<Int>): List<Int> {
    return grades
        .filter { it >= 60 }
        .sorted()
        .take(3)
}

// Задача 26: Создание каталога по первой букве
fun createCatalog(items: List<String>): Map<Char, List<String>> {
    return items
        .map { it.lowercase() }
        .groupBy { it.first() }
}

// Задача 27: Подсчёт средней длины слов в списке
fun calculateAverageWordLength(words: List<String>): String {
    val average = words
        .map { it.length }
        .average()

    return "Средняя длина слова: %.2f".format(average)
}

// Задача 28: Категоризация чисел
fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    return numbers
        .distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "четные" else "нечетные" }
}

// Задача 29: Поиск первого подходящего элемента
fun findFirstSuitableAge(ages: List<Int?>, minAge: Int): Int? {
    return ages
        .filterNotNull()
        .firstOrNull { it > minAge }
}