package lesson10.homework

fun main() {


    // 1: Пустой неизменяемый словарь (Int : Int)
    println("1. Пустой неизменяемый словарь:")
    val emptyMap: Map<Int, Int> = mapOf()
    println("Размер словаря: ${emptyMap.size}\n")

    //  2: Словарь с парами (Float : Double)
    println("2. Словарь Float - Double:")
    val floatToDouble: Map<Float, Double> = mapOf(
        1.5f to 2.5,
        3.7f to 4.9,
        5.2f to 6.8
    )
    println("Словарь: $floatToDouble\n")

    // Задача 3: Изменяемый словарь (Int : String)
    println("3. Изменяемый словарь Int - String:")
    val mutableDict: MutableMap<Int, String> = mutableMapOf(
        1 to "один",
        2 to "два"
    )
    println("Изначальный словарь: $mutableDict\n")

    // 4: Добавление новых пар в изменяемый словарь
    println("4. Добавление новых пар:")
    mutableDict[3] = "три"
    mutableDict.put(4, "четыре")
    mutableDict[5] = "пять"
    println("После добавления: $mutableDict\n")

    //  5: Извлечение значения по ключу
    println("5. Извлечение значений:")
    val value1 = mutableDict[3]
    println("Значение по ключу 3: $value1")
    val value2 = mutableDict[100] // ключа нет в словаре
    println("Значение по ключу 100 (его нет): $value2")
    val value3 = mutableDict.getOrDefault(100, "не найдено")
    println("С использованием getOrDefault: $value3\n")

    //  6: Удаление элемента по ключу
    println("6. Удаление элемента:")
    mutableDict.remove(2)
    println("После удаления ключа 2: $mutableDict\n")

    // 7: Деление ключа на значение с обработкой деления на 0
    println("7. Деление ключей на значения:")
    val divisionMap: Map<Double, Int> = mapOf(
        10.0 to 2,
        15.5 to 5,
        20.0 to 0,  // деление на 0
        100.0 to 10
    )
    for ((key, value) in divisionMap) {
        if (value == 0) {
            println("$key / $value = бесконечность")
        } else {
            println("$key / $value = ${key / value}")
        }
    }
    println()

    // 8: Изменение значения для существующего ключа
    println("8. Изменение значения:")
    println("До изменения: $mutableDict")
    mutableDict[3] = "ТРИ"
    println("После изменения значения для ключа 3: $mutableDict\n")

    // 9: Объединение двух словарей через циклы
    println("9. Объединение двух словарей:")
    val dict1 = mapOf(1 to "a", 2 to "b", 3 to "c")
    val dict2 = mapOf(3 to "C", 4 to "d", 5 to "e")
    val mergedDict: MutableMap<Int, String> = mutableMapOf()

    for ((key, value) in dict1) {
        mergedDict[key] = value
    }
    for ((key, value) in dict2) {
        mergedDict[key] = value
    }
    println("Словарь 1: $dict1")
    println("Словарь 2: $dict2")
    println("Объединённый словарь: $mergedDict\n")

    // 10: Словарь String - List<Int>
    println("10. Словарь со списками:")
    val stringToListMap: MutableMap<String, List<Int>> = mutableMapOf()
    stringToListMap["четные"] = listOf(2, 4, 6, 8)
    stringToListMap["нечетные"] = listOf(1, 3, 5, 7)
    stringToListMap["простые"] = listOf(2, 3, 5, 7, 11)
    println("Словарь: $stringToListMap\n")

    // 11: Словарь Int - MutableSet<String>
    println("11. Словарь с изменяемыми множествами:")
    val intToSetMap: MutableMap<Int, MutableSet<String>> = mutableMapOf(
        1 to mutableSetOf("apple", "banana"),
        2 to mutableSetOf("cat", "dog"),
        3 to mutableSetOf("red", "blue")
    )
    println("Изначальный словарь: $intToSetMap")

    val mySet = intToSetMap[2]
    mySet?.add("elephant")
    println("Множество по ключу 2 после добавления: $mySet")
    println("Обновлённый словарь: $intToSetMap\n")

    // 12: Словарь с парами чисел в качестве ключей
    println("12. Поиск пары с цифрой 5:")
    val pairMap: Map<Pair<Int, Int>, String> = mapOf(
        Pair(1, 2) to "первая",
        Pair(5, 3) to "вторая",
        Pair(7, 8) to "третья",
        Pair(4, 5) to "четвертая",
        Pair(9, 10) to "пятая"
    )

    for ((key, value) in pairMap) {
        if (key.first == 5 || key.second == 5) {
            println("Найдена пара: $key -> $value")
        }
    }
    println()

    println("\nЗадачи на подбор оптимального типа\n")

    // 1: Словарь библиотека
    println("1. Библиотека (Автор - Список книг):")
    val library: MutableMap<String, MutableList<String>> = mutableMapOf()
    library["Толстой"] = mutableListOf("Война и мир", "Анна Каренина")
    library["Достоевский"] = mutableListOf("Преступление и наказание", "Идиот")
    library["Пушкин"] = mutableListOf("Евгений Онегин", "Капитанская дочка")
    println("Библиотека: $library\n")

    // Задача 2: Справочник растений
    println("2. Справочник растений (Тип - Список растений):")
    val plantGuide: MutableMap<String, MutableList<String>> = mutableMapOf()
    plantGuide["Цветы"] = mutableListOf("Роза", "Тюльпан", "Лилия")
    plantGuide["Деревья"] = mutableListOf("Дуб", "Сосна", "Береза")
    plantGuide["Кустарники"] = mutableListOf("Сирень", "Жасмин", "Малина")
    println("Справочник: $plantGuide\n")

    // 3: Четвертьфинала
    println("3. Четвертьфинала (Команда - Список игроков):")
    val tournament: MutableMap<String, MutableList<String>> = mutableMapOf()
    tournament["Спартак"] = mutableListOf("Иванов", "Петров", "Сидоров")
    tournament["Динамо"] = mutableListOf("Козлов", "Волков", "Медведев")
    tournament["ЦСКА"] = mutableListOf("Орлов", "Соколов", "Беркутов")
    println("Команды: $tournament\n")

    // 4: Курс лечения
    println("4. Курс лечения (Дата - Список препаратов):")
    val treatment: MutableMap<String, MutableList<String>> = mutableMapOf()
    treatment["2025-01-15"] = mutableListOf("Аспирин", "Витамин C")
    treatment["2025-01-16"] = mutableListOf("Парацетамол", "Витамин D")
    treatment["2025-01-17"] = mutableListOf("Аспирин", "Антибиотик")
    println("Курс лечения: $treatment\n")

    //  5: Словарь путешественника
    println("5. Словарь путешественника (Страна -> Город -> Места):")
    val travelGuide: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf()

    travelGuide["Россия"] = mutableMapOf(
        "Москва" to mutableListOf("Красная площадь", "Кремль", "Третьяковка"),
        "Санкт-Петербург" to mutableListOf("Эрмитаж", "Петергоф", "Невский проспект")
    )

    travelGuide["Франция"] = mutableMapOf(
        "Париж" to mutableListOf("Эйфелева башня", "Лувр", "Нотр-Дам"),
        "Марсель" to mutableListOf("Старый порт", "Базилика Нотр-Дам-де-ла-Гард")
    )

    println("Путеводитель:")
    for ((country, cities) in travelGuide) {
        println("$country:")
        for ((city, places) in cities) {
            println("  $city: $places")
        }
    }
}