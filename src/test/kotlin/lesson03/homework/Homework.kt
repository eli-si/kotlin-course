package lesson03.homework

// 1. Название мероприятия
val eventName: String = "Hot Hackathon"

// 2. Дата проведения
var eventDate: String = "17 ноября 2025"

// 3. Место проведения
var venueLocation: String = "Дом культуры железнодорожников, Актовый зал"

// 4. Подробный бюджет мероприятия
private val internalBudgetDetails: String =
    "Поставщики/суммы/договоры (для внутреннего пользования)"

// 5. Количество участников
var participantCount: Int = 155

// 6. Длительность хакатона в днях
val hackathonDurationDays: Int = 2

// 7. Контакты и условия соглашений с поставщиками
private val vendorsContactsAndTerms: String =
    "Контакты, KPI, штрафы, страховые условия"

// 8. Текущий статус хакатона
var status: String = "Подготовка"
    private set


// 9. Список спонсоров
val sponsors: String = "Савушкин продукт; Брестский мясокомбинат; Гефест"

// 10. Бюджет мероприятия
val publicBudgetSummary: String = "Итого бюджет: 6 500 000 ₽"

// 11. Текущий уровень доступа к интернету
var internetAccessLevel: String = "Стабильный 300 Мбит/с"

// 12. Логистика/транспорт/распределение ресурсов
private val logisticsAndOps: String =
    "Маршруты, ответственные, склады, распределение ресурсов"

// 13. Количество команд
var teamCount: Int = 32

// 14. Перечень задач
var taskList: String = "Видеоигра про енота; Приложение мониторинга стихийных бедствий"

// 15. План эвакуации
val evacuationPlan: String = "Схема эвакуации , инструкция для стендов"

// 16. Список доступного оборудования
val equipmentAvailable: String = "Ноутбуки x30; роутеры x13; свитчи x6; 3D-принтеры x5"

// 17. Список свободного оборудования
var equipmentFreeNow: String = "Ноутбуки x7; роутеры x2; 3D-принтер x1"

// 18. График питания
lateinit var mealSchedule: String

// 19. План на случай сбоев
private val contingencyPlan: String =
    "Сценарии, ответственные, контакты служб"

// 20. Список экспертов и жюри
val expertsAndJury: String = "Антон Логвинов.; Шевцов."

// 21. Политика конфиденциальности
val privacyPolicy: String = "Сбор и обработка данных по стандартам GDPR"

// 22. Приватные отзывы участников/зрителей
private var privateFeedback: String = ""

// 23. Текущая температура в помещении
var roomTemperatureC: Int = 23

// 24. Данные мониторинга сети
private val networkMonitoringDump: String by lazy {
    "Сводка графиков, логи, ошибки"
}


var internetThrottleCoefficient: String = "1.0"

// 26. Уровень освещения
var lightLevelLux: Int = 330

// 27. Лог событий
var eventLog: String = "Система запущена"
    private set

// 28. Медпомощь доступна на площадке (публичная неизменяемая: да/нет)
val onSiteMedicalAvailable: Boolean = true

// 29. Планы и процедуры безопасности, ЧС
val safetyAndEmergencyPlan: String =
    "Ответственные, маршруты, точки сбора, номера служб "

// 30. Регистрационный номер мероприятия
var registrationNumber: String = "HH-2025-001"

// 31. Максимально допустимый уровень шума
val maxNoiseDb: Int = 75

// 32. Индикатор превышения уровня шума
var isNoiseExceeded: Boolean = false
    private set

// 33. План взаимодействия с прессой (публичная неизменяемая: PR-документ)
val pressPlan: String = "Спикеры, даты интервью, пресс-релизы"

// 34. Публичная детальная инфо о проектах
val publicProjectsTechReport: String by lazy {
    "Артефакты, автотесы"
}

// 35. Статус получения разрешений (публичная изменяемая: процессный статус)
var permitsStatus: String = "В работе"

// 36. Доступность спецоборудования прямо сейчас
var specializedEquipmentAvailable: Boolean = true

// 37. Список партнёров мероприятия
val partners: String = "Игромания; HH.ru; Habr"

// 38. Отчёт

lateinit var postEventReportLink: String

// 39. Внутренние правила распределения призов (приватная неизменяемая)
private val internalPrizeRules: String =
    "Критерии"

// 40. Список разыгрываемых призов
val prizes: String = "1) Приз 50k ₽; 2) Ноутбуки; 3) Планшеты"

// 41. Контакты экстренных служб и медперсонала
private val emergencyContactsInternal: String =
    "112; 103"

// 42. Особые условия для участников с ОВЗ
val accessibilityArrangements: String =
    "Пандусы, сурдоперевод"

// 43. Общее настроение участников
var participantsMood: String = "Хорошее"

// 44. Подробный тайминг хакатона
lateinit var detailedRunOfShow: String

// 45. Имя специального гостя
lateinit var specialGuestName: String

// 46. Максимальная вместимость площадки
val venueCapacityMax: Int = 500

// 47. Кол-во часов на проект у каждой команды
val hoursPerTeam: Int = 30
