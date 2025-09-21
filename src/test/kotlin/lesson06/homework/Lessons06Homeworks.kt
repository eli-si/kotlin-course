package lesson06.homework




/* ЗАДАНИЕ 1 */
/** month: номер месяца 1..12; печатает сезон на русском. */
fun printSeasonByMonth(month: Int) {
    if (month !in 1..12) {
        println("Ошибка: номер месяца должен быть от 1 до 12, получено $month")
        return
    }
    val season = when (month) {
        12, 1, 2 -> "зима"
        3, 4, 5 -> "весна"
        6, 7, 8 -> "лето"
        else -> "осень" // 9,10,11
    }
    println(season)
}

/*ЗАДАНИЕ 2*/

fun printDogAgeHumanYears(ageYears: Double) {
    if (ageYears < 0.0) {
        println("Ошибка: возраст собаки не может быть отрицательным ($ageYears)")
        return
    }
    val humanYears = when {
        ageYears <= 2.0 -> ageYears * 10.5
        else -> 2 * 10.5 + (ageYears - 2.0) * 4.0
    }
    println("Возраст собаки в человеческих годах: ${"%.2f".format(humanYears)}")
}

/* ЗАДАНИЕ 3.*/

fun printTransportByDistance(distanceKm: Double) {
    if (distanceKm < 0) {
        println("Ошибка: расстояние не может быть отрицательным ($distanceKm)")
        return
    }
    val mode = when {
        distanceKm <= 1.0 -> "пешком"
        distanceKm <= 5.0 -> "велосипед"
        else -> "автотранспорт"
    }
    println(mode)
}

/* ЗАДАНИЕ 4 */

fun printBonusPoints(sumRub: Double) {
    if (sumRub < 0) {
        println("Ошибка: сумма покупки не может быть отрицательной ($sumRub)")
        return
    }
    val hundreds = (sumRub / 100.0).toInt() // считаем только полные сотни
    val rate = if (sumRub <= 1000.0) 2 else 3
    val points = hundreds * rate
    println("Бонусные баллы: $points")
}

/* ЗАДАНИЕ 5.  */

fun printDocumentTypeByExtension(extension: String) {
    val ext = extension.trim().removePrefix(".").lowercase()
    if (ext.isEmpty()) {
        println("Ошибка: расширение файла пустое")
        return
    }
    val type = when (ext) {
        // Текст
        "txt", "md", "rtf", "doc", "docx", "odt", "pdf" -> "Текстовый документ"
        // Изображения
        "jpg", "jpeg", "png", "gif", "bmp", "webp", "svg", "tiff" -> "Изображение"
        // Таблицы
        "xls", "xlsx", "csv", "ods", "tsv" -> "Таблица"
        else -> "Неизвестный тип"
    }
    println(type)
}

/* ЗАДАНИЕ 6*/

fun convertTemperature(value: Double, unit: Char) {
    val u = unit.uppercaseChar()
    when (u) {
        'C' -> {
            val f = value * 9.0 / 5.0 + 32.0
            print("%.2f".format(f))
            print("F")
            println()
        }
        'F' -> {
            val c = (value - 32.0) * 5.0 / 9.0
            print("%.2f".format(c))
            print("C")
            println()
        }
        else -> println("Ошибка: единица измерения должна быть 'C' или 'F', получено '$unit'")
    }
}

/* ЗАДАНИЕ 7 */

fun printClothesByWeather(tC: Double) {
    if (tC < -30.0 || tC > 35.0) {
        println("Рекомендуется не выходить из дома")
        return
    }
    val advice = when {
        tC < 10.0 -> "куртка и шапка"
        tC <= 18.0 -> "ветровка"
        else -> "футболка и шорты"
    }
    println(advice)
}

/* ЗАДАНИЕ 8 */

fun categoriesByAge(age: Int): String {
    if (age < 0) {
        println("Ошибка: возраст не может быть отрицательным ($age)")
        return "некорректный возраст"
    }
    val cat = when (age) {
        in 0..9 -> "детские"
        in 10..18 -> "подростковые"
        else -> "18+"
    }
    println(cat)
    return cat
}

/* Примеры  */
fun main() {
    // Задание 1
    printSeasonByMonth(3)     // весна
    printSeasonByMonth(13)    // ошибка

    // Задание 2
    printDogAgeHumanYears(1.5) // 15.75
    printDogAgeHumanYears(5.0) // 2*10.5 + 3*4 = 33.0
    printDogAgeHumanYears(-1.0) // ошибка

    // Задание 3
    printTransportByDistance(0.8) // пешком
    printTransportByDistance(3.2) // велосипед
    printTransportByDistance(7.0) // автотранспорт

    // Задание 4
    printBonusPoints(999.0)   // 2*9 = 18
    printBonusPoints(1000.0)  // 2*10 = 20
    printBonusPoints(1450.0)  // 3*14 = 42
    printBonusPoints(-5.0)    // ошибка

    // Задание 5
    printDocumentTypeByExtension(".PNG") // Изображение
    printDocumentTypeByExtension("xlsx") // Таблица
    printDocumentTypeByExtension("unknown") // Неизвестный тип

    // Задание 6
    convertTemperature(0.0, 'C')   // 32.00F
    convertTemperature(212.0, 'F') // 100.00C
    convertTemperature(10.0, 'X')  // ошибка

    // Задание 7
    printClothesByWeather(-35.0) // не выходить
    printClothesByWeather(5.0)   // куртка и шапка
    printClothesByWeather(15.0)  // ветровка
    printClothesByWeather(22.0)  // футболка и шорты

    // Задание 8
    categoriesByAge(7)   // детские
    categoriesByAge(15)  // подростковые
    categoriesByAge(25)  // 18+
}
