package lesson11.homeworks

// Задачи на сигнатуру метода

// 1. Не принимает аргументов и не возвращает значения
public fun doNothing(): Unit {
    // тело функции
}

// 2. Принимает два целых числа и возвращает их сумму
public fun sum(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает
public fun printString(str: String): Unit {
    // тело функции
}

// 4. Принимает список целых чисел и возвращает среднее значение типа Double
public fun average(numbers: List<Int>): Double {
    return 0.0
}

// 5. Принимает nullable строку и возвращает её длину в виде nullable целого числа
// и доступна только в текущем файле
private fun getLength(str: String?): Int? {
    return null
}

// 6. Не принимает аргументов и возвращает nullable вещественное число
public fun getDouble(): Double? {
    return null
}

// 7. Принимает nullable список целых чисел, не возвращает значения
// и доступна только в текущем файле
private fun processNumbers(numbers: List<Int>?): Unit {
    // тело функции
}

// 8. Принимает целое число и возвращает nullable строку
public fun convertToString(number: Int): String? {
    return null
}

// 9. Не принимает аргументов и возвращает список nullable строк
public fun getListOfStrings(): List<String?> {
    return emptyList()
}

// 10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение
public fun compare(str: String?, num: Int?): Boolean? {
    return null
}


// Задачи на написание кода

// 1. Функция multiplyByTwo - умножает число на 2
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

// 2. Функция isEven - проверяет, является ли число чётным
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 3. Функция printNumbersUntil - выводит числа от 1 до n
fun printNumbersUntil(n: Int): Unit {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

// 4. Функция findFirstNegative - находит первое отрицательное число в списке
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

// 5. Функция processList - выводит строки из списка до первого null
fun processList(strings: List<String?>): Unit {
    for (str in strings) {
        if (str == null) {
            return
        }
        println(str)
    }
}


// Примеры использования

fun main() {
    println(" Примеры работы функций \n")

    // Пример 1: multiplyByTwo
    println("multiplyByTwo(5) = ${multiplyByTwo(5)}")

    // Пример 2: isEven
    println("isEven(4) = ${isEven(4)}")
    println("isEven(7) = ${isEven(7)}")

    // Пример 3: printNumbersUntil
    println("\nprintNumbersUntil(5):")
    printNumbersUntil(5)

    // Пример 4: findFirstNegative
    val numbers = listOf(1, 2, -3, 4, -5)
    println("\nfindFirstNegative($numbers) = ${findFirstNegative(numbers)}")

    // Пример 5: processList
    val strings = listOf("Привет", "Мир", null, "Kotlin")
    println("\nprocessList($strings):")
    processList(strings)
}