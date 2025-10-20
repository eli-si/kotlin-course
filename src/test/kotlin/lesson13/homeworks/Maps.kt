package lesson13.homeworks

// ===============================================
// Домашняя работа по Kotlin: Словари (Maps)
// ===============================================

fun main() {


    // Задача 1: Среднее время выполнения теста
    println("1. Среднее время выполнения теста:")
    val testTimes = mapOf("test1" to 5.2, "test2" to 3.8, "test3" to 7.1, "test4" to 4.5)
    val averageTime = testTimes.values.average()
    println("Среднее время: $averageTime секунд\n")

    // Задача 2: Список всех тестовых методов
    println("2. Список всех тестовых методов:")
    val testMetadata = mapOf(
        "testLogin" to "priority:high,tags:auth",
        "testLogout" to "priority:medium,tags:auth",
        "testSearch" to "priority:low,tags:search"
    )
    val testMethods = testMetadata.keys.toList()
    println("Методы: $testMethods\n")

    // Задача 3: Добавить новый тест
    println("3. Добавление нового теста:")
    val testResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    testResults["test3"] = "passed"
    println("Результаты после добавления: $testResults\n")

    // Задача 4: Количество успешных тестов
    println("4. Количество успешных тестов:")
    val results = mapOf(
        "test1" to "passed",
        "test2" to "failed",
        "test3" to "passed",
        "test4" to "skipped",
        "test5" to "passed"
    )
    val passedCount = results.count { it.value == "passed" }
    println("Успешных тестов: $passedCount\n")

    // Задача 5: Удалить запись о баге
    println("5. Удаление исправленного бага:")
    val bugs = mutableMapOf(
        "BUG-101" to "fixed",
        "BUG-102" to "open",
        "BUG-103" to "fixed"
    )
    bugs.remove("BUG-101")
    println("Баги после удаления: $bugs\n")

    // Задача 6: Вывести сообщение о странице и статусе
    println("6. Статусы проверки веб-страниц:")
    val pageStatuses = mapOf(
        "https://example.com" to 200,
        "https://test.com" to 404,
        "https://api.com" to 500
    )
    pageStatuses.forEach { (url, status) ->
        println("Страница: $url, Статус: $status")
    }
    println()

    // Задача 7: Найти сервисы с временем ответа выше порога
    println("7. Сервисы с медленным временем ответа:")
    val serviceTimes = mapOf(
        "AuthService" to 150,
        "DataService" to 350,
        "PaymentService" to 280,
        "NotificationService" to 90
    )
    val threshold = 200
    val slowServices = serviceTimes.filter { it.value > threshold }
    println("Сервисы с временем > $threshold ms: $slowServices\n")

    // Задача 8: Найти статус endpoint или предположить
    println("8. Статус API endpoint:")
    val apiResults = mapOf(
        "/api/users" to "200 OK",
        "/api/orders" to "404 Not Found",
        "/api/products" to "200 OK"
    )
    val endpoint = "/api/payments"
    val status = apiResults.getOrElse(endpoint) { "не был протестирован" }
    println("Endpoint $endpoint: $status\n")

    // Задача 9: Получить browserType (не может быть null)
    println("9. Получение типа браузера:")
    val config = mapOf(
        "browserType" to "Chrome",
        "timeout" to "30",
        "headless" to "false"
    )
    val browserType = config.getValue("browserType")
    println("Тип браузера: $browserType\n")

    // Задача 10: Создать копию неизменяемого словаря с добавлением
    println("10. Копия словаря с новой версией:")
    val versions = mapOf("v1.0" to "stable", "v1.1" to "beta")
    val newVersions = versions.plus("v1.2" to "alpha")
    println("Новые версии: $newVersions\n")

    // Задача 11: Получить настройки для модели или по умолчанию
    println("11. Настройки для мобильного устройства:")
    val deviceSettings = mapOf(
        "iPhone 14" to "iOS 16, 1170x2532",
        "Samsung S23" to "Android 13, 1080x2340"
    )
    val model = "Pixel 7"
    val settings = deviceSettings.getOrDefault(model, "default: Android, 1080x1920")
    println("Настройки для $model: $settings\n")

    // Задача 12: Проверить наличие кода ошибки
    println("12. Проверка наличия кода ошибки:")
    val errors = mapOf(
        "ERR_001" to "Connection timeout",
        "ERR_002" to "Invalid credentials",
        "ERR_003" to "Resource not found"
    )
    val errorCode = "ERR_002"
    val hasError = errors.containsKey(errorCode)
    println("Содержит код $errorCode: $hasError\n")

    // Задача 13: Отфильтровать по версии в ключе
    println("13. Фильтрация по версии теста:")
    val testScenarios = mapOf(
        "TestID_001_v2" to "Passed",
        "TestID_002_v1" to "Failed",
        "TestID_003_v2" to "Skipped",
        "TestID_004_v2" to "Passed"
    )
    val targetVersion = "v2"
    val filteredScenarios = testScenarios.filterKeys { it.contains(targetVersion) }
    println("Сценарии версии $targetVersion: $filteredScenarios\n")

    // Задача 14: Проверить наличие модулей с неудачным тестированием
    println("14. Проверка модулей с неудачным тестированием:")
    val moduleResults = mapOf(
        "LoginModule" to "passed",
        "PaymentModule" to "failed",
        "SearchModule" to "passed"
    )
    val hasFailures = moduleResults.any { it.value == "failed" }
    println("Есть неудачные модули: $hasFailures\n")

    // Задача 15: Добавить настройки из другого словаря
    println("15. Добавление настроек из другого словаря:")
    val envSettings = mutableMapOf("timeout" to "30", "retries" to "3")
    val additionalSettings = mapOf("logging" to "verbose", "cache" to "enabled")
    envSettings.putAll(additionalSettings)
    println("Настройки после добавления: $envSettings\n")

    // Задача 16: Объединить два неизменяемых словаря
    println("16. Объединение словарей с багами:")
    val bugs1 = mapOf("BUG-201" to "critical", "BUG-202" to "minor")
    val bugs2 = mapOf("BUG-203" to "major", "BUG-204" to "trivial")
    val allBugs = bugs1 + bugs2
    println("Все баги: $allBugs\n")

    // Задача 17: Очистить изменяемый словарь
    println("17. Очистка временных данных:")
    val tempData = mutableMapOf("lastRun" to "2025-10-20", "duration" to "45s")
    println("До очистки: $tempData")
    tempData.clear()
    println("После очистки: $tempData\n")

    // Задача 18: Исключить тесты со статусом "skipped"
    println("18. Исключение пропущенных тестов:")
    val report = mapOf(
        "test_A" to "passed",
        "test_B" to "skipped",
        "test_C" to "failed",
        "test_D" to "skipped"
    )
    val activeTests = report.filterValues { it != "skipped" }
    println("Отчет без пропущенных: $activeTests\n")

    // Задача 19: Создать копию удалив несколько конфигураций
    println("19. Копия конфигурации без некоторых параметров:")
    val configurations = mapOf(
        "config1" to "value1",
        "config2" to "value2",
        "config3" to "value3",
        "config4" to "value4"
    )
    val reducedConfig = configurations - listOf("config2", "config4")
    println("Уменьшенная конфигурация: $reducedConfig\n")

    // Задача 20: Создать отчет в виде списка строк
    println("20. Отчет о тестировании:")
    val testingResults = mapOf("T001" to "Passed", "T002" to "Failed", "T003" to "Passed")
    val reportLines = testingResults.map { (id, result) -> "Test $id: $result" }
    reportLines.forEach { println(it) }
    println()

    // Задача 21: Преобразовать изменяемый в неизменяемый
    println("21. Архивация результатов:")
    val mutableResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    val archivedResults = mutableResults.toMap()
    println("Архивированные результаты: $archivedResults")
    println("Тип: ${archivedResults::class.simpleName}\n")

    // Задача 22: Заменить числовые ID на строковые
    println("22. Преобразование ID в строки:")
    val numericTests = mapOf(1 to 5.2, 2 to 3.8, 3 to 7.1)
    val stringTests = numericTests.mapKeys { it.key.toString() }
    println("Тесты со строковыми ID: $stringTests\n")

    // Задача 23: Увеличить оценки на 10%
    println("23. Увеличение оценок производительности на 10%:")
    val performance = mapOf("v1.0" to 100.0, "v2.0" to 85.5, "v3.0" to 92.3)
    val adjustedPerformance = performance.mapValues { it.value * 1.1 }
    println("Скорректированная производительность: $adjustedPerformance\n")

    // Задача 24: Проверить, пуст ли словарь
    println("24. Проверка на пустоту:")
    val compilationErrors = mapOf<String, String>()
    val isEmptyCheck = compilationErrors.isEmpty()
    println("Словарь с ошибками компиляции пуст: $isEmptyCheck\n")

    // Задача 25: Проверить, не пуст ли словарь
    println("25. Проверка на наличие данных:")
    val loadTestResults = mapOf("endpoint1" to 250, "endpoint2" to 180)
    val hasData = loadTestResults.isNotEmpty()
    println("Результаты нагрузочного тестирования не пусты: $hasData\n")

    // Задача 26: Проверить, все ли тесты успешны
    println("26. Проверка успешности всех тестов:")
    val automatedTests = mapOf(
        "test1" to "passed",
        "test2" to "passed",
        "test3" to "passed"
    )
    val allPassed = automatedTests.all { it.value == "passed" }
    println("Все тесты прошли успешно: $allPassed\n")

    // Задача 27: Проверить наличие хотя бы одного теста с ошибкой
    println("27. Проверка наличия ошибок:")
    val testReport = mapOf(
        "test1" to "passed",
        "test2" to "error",
        "test3" to "passed"
    )
    val hasErrors = testReport.containsValue("error")
    println("Есть хотя бы один тест с ошибкой: $hasErrors\n")

    // Задача 28: Отфильтровать непрошедшие тесты с "optional"
    println("28. Фильтрация необязательных непрошедших тестов:")
    val serviceTests = mapOf(
        "optional_service_auth" to "failed",
        "critical_service_payment" to "passed",
        "optional_service_logging" to "failed",
        "optional_service_cache" to "passed",
        "critical_service_db" to "failed"
    )
    val failedOptional = serviceTests.filter {
        it.value != "passed" && it.key.contains("optional")
    }
    println("Непрошедшие необязательные тесты: $failedOptional\n")

    println("Все задачи выполнены")
}