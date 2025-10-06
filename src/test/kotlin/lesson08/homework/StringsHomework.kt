package lesson08.homework

import java.nio.charset.Charset
import java.io.PrintStream
import java.nio.charset.StandardCharsets



/*
   1 Преобразование фраз
   Правила (регистронезависимо):
   - если фраза состоит из одного слова: "Иногда, <слово>, но не всегда"
   - если начинается с "Я не уверен": добавить в КОНЕЦ ", но моя интуиция говорит об обратном"
   - заменить "невозможно" на "совершенно точно возможно, просто требует времени"
   - заменить "катастрофа" нп "интересное событие"
   - если заканчивается на "без проблем": заменить на "с парой интересных вызовов на пути"
   Преобразования выполняются последовательно .
    */

fun transformPhrase(raw: String): String {
    var s = raw.trim()

    // 1) Только одно «слово»? (любой непробельный блок)
    val words = Regex("\\S+").findAll(s).toList()
    if (words.size == 1) {
        val word = words.first().value
        return "Иногда, $word, но не всегда"
    }

    // 2 Начинается с "Я не уверен"
    if (s.startsWith("Я не уверен", ignoreCase = true)) {
        val suffix = ", но моя интуиция говорит об обратном"
        if (!s.endsWith(suffix, ignoreCase = true)) {
            s += suffix
        }
    }

    // 3 Заменяем "невозможно" (как слово)
    s = Regex("\\bневозможно\\b", RegexOption.IGNORE_CASE)
        .replace(s, "совершенно точно возможно, просто требует времени")

    // 4 Заменяем "катастрофа" (как слово)
    s = Regex("\\bкатастрофа\\b", RegexOption.IGNORE_CASE)
        .replace(s, "интересное событие")

    // 5 Если заканчивается на "без проблем"
    if (s.endsWith("без проблем", ignoreCase = true)) {
        s = s.removeSuffix("без проблем")
            .removeSuffix("Без проблем")
            .trimEnd() + " с парой интересных вызовов на пути"
    }

    return s
}

/*    2) Извлечение даты и времени из строки лога   */

fun printDateAndTimeFromLog(log: String) {
    val arrow = log.indexOf("->")
    if (arrow == -1) {
        println("Ошибка: не найден разделитель \"->\"")
        return
    }
    val right = log.substring(arrow + 2).trim()          // "2021-12-01 09:48:23"
    val parts = right.split(Regex("\\s+"), limit = 2)     // [дата, время]
    if (parts.size != 2) {
        println("Ошибка: правая часть лога не соответствует формату 'YYYY-MM-DD HH:MM:SS'")
        return
    }
    val (date, time) = parts
    println(date)
    println(time)
}

/*    3 Маскирование номера карты — оставляем последние 4 цифры. */

fun maskCardNumber(s: String): String {
    val totalDigits = s.count { it.isDigit() }
    var seen = 0
    val sb = StringBuilder(s.length)

    for (ch in s) {
        if (ch.isDigit()) {
            seen++
            if (seen <= totalDigits - 4) sb.append('*') else sb.append(ch)
        } else {
            sb.append(ch)
        }
    }
    return sb.toString()
}

/* 4 Форматирование e-mail: "user@example.com"      "user [at] example [dot] com" */

fun formatEmailPretty(email: String): String {
    return email.replace("@", " [at] ")
        .replace(".", " [dot] ")
}

/*  5 Извлечение имени файла с расширением из пути */

fun fileNameFromPath(path: String): String {
    if (path.isBlank()) return ""
    val parts = path.split(Regex("[/\\\\]+")).filter { it.isNotBlank() }
    return if (parts.isEmpty()) "" else parts.last()
}

/*    6 Аббревиатура из фразы: берём первые буквы слов (верхний регистр).
       */

fun makeAbbreviation(phrase: String): String {
    val words = phrase.trim().split(Regex("\\s+")).filter { it.isNotEmpty() }
    var acc = ""
    for (w in words) {
        val first = w.first()
        acc += first.uppercase()
    }
    return acc
}

/*  запуск   */

fun main() {

    println("file.encoding=" + System.getProperty("file.encoding"))
    println("defaultCharset=" + Charset.defaultCharset())
    if (!StandardCharsets.UTF_8.name().equals(System.getProperty("file.encoding"), true)) {
        try {
            System.setOut(PrintStream(System.out, true, StandardCharsets.UTF_8))
        } catch (_: Exception) {

        }
    }
    // === /diag ===

    // 1 Преобразования
    val samples = listOf(
        "Это невозможно выполнить за один день",
        "Я не уверен в успехе этого проекта",
        "Произошла катастрофа на сервере",
        "Этот код работает без проблем",
        "Удача"
    )
    println("== Трансформации фраз ==")
    for (line in samples) {
        println("→ ${transformPhrase(line)}")
    }
    println()

    // 2 Лог: дата и время
    println("== Парсинг лога ==")
    printDateAndTimeFromLog("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    println()

    // 3 Маска карты
    println("== Маскирование карты ==")
    println(maskCardNumber("4539 1488 0343 6467"))
    println(maskCardNumber("4111-1111-1111-1111"))
    println()

    // 4 E-mail формат
    println("== E-mail pretty ==")
    println(formatEmailPretty("username@example.com"))
    println()

    // 5 Имя файла из пути
    println("== Имя файла из пути ==")
    println(fileNameFromPath("C:/Пользователи/Документы/report.txt"))
    println(fileNameFromPath("D:/good.themes/dracula.theme"))
    println(fileNameFromPath("justafile"))
    println()

    // 6 Аббревиатура
    println("== Аббревиатура ==")
    println(makeAbbreviation("Котлин лучший язык программирования"))
}

