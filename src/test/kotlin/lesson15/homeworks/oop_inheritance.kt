package lesson15.homeworks



import kotlin.math.max

// Задание 1: Геометрические Фигуры


// геометрические фигуры

open class GeometricShape(
    val color: String,
    val filled: Boolean
) {
    open fun getArea(): Double = 0.0

    open fun getPerimeter(): Double = 0.0

    open fun describe() {
        println("Фигура: ${this.javaClass.simpleName}, Цвет: $color, Заполнена: $filled")
    }
}


// Многоугольники

open class Polygon(
    color: String,
    filled: Boolean,
    val sides: Int
) : GeometricShape(color, filled) {

    fun getNumberOfSides(): Int = sides

    override fun describe() {
        super.describe()
        println("Количество сторон: $sides")
    }
}


// круг

class Circle(
    color: String,
    filled: Boolean,
    val radius: Double
) : GeometricShape(color, filled) {

    override fun getArea(): Double = Math.PI * radius * radius

    override fun getPerimeter(): Double = 2 * Math.PI * radius

    fun getDiameter(): Double = 2 * radius
}


// треугольник

class Triangle(
    color: String,
    filled: Boolean,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Polygon(color, filled, 3) {

    override fun getPerimeter(): Double = sideA + sideB + sideC

    override fun getArea(): Double {
        val s = getPerimeter() / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    fun getType(): String {
        return when {
            sideA == sideB && sideB == sideC -> "Равносторонний"
            sideA == sideB || sideB == sideC || sideA == sideC -> "Равнобедренный"
            else -> "Разносторонний"
        }
    }
}


// четырехугольник

open class Quadrilateral(
    color: String,
    filled: Boolean,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double,
    val sideD: Double
) : Polygon(color, filled, 4) {

    override fun getPerimeter(): Double = sideA + sideB + sideC + sideD
}


// прямоугольник

class Rectangle(
    color: String,
    filled: Boolean,
    val width: Double,
    val height: Double
) : Quadrilateral(color, filled, width, height, width, height) {

    override fun getArea(): Double = width * height

    fun isSquare(): Boolean = width == height
}

// Задание 2: Учебные Заведения


// класс для учебных заведений

open class EducationalInstitution(
    val name: String,
    val address: String,
    val studentsCount: Int
) {
    open fun getType(): String = "Учебное заведение"

    fun printInfo() {
        println("${getType()}: $name")
        println("Адрес: $address")
        println("Количество учащихся: $studentsCount")
    }
}

// Класс для школы

open class School(
    name: String,
    address: String,
    studentsCount: Int,
    val schoolNumber: Int,
    val hasUniform: Boolean
) : EducationalInstitution(name, address, studentsCount) {

    override fun getType(): String = "Школа"

    fun printSchoolInfo() {
        printInfo()
        println("Номер школы: $schoolNumber")
        println("Наличие формы: ${if (hasUniform) "Да" else "Нет"}")
    }
}


// Класс для университета

open class University(
    name: String,
    address: String,
    studentsCount: Int,
    val facultiesCount: Int,
    val hasHostel: Boolean
) : EducationalInstitution(name, address, studentsCount) {

    override fun getType(): String = "Университет"

    fun printUniversityInfo() {
        printInfo()
        println("Количество факультетов: $facultiesCount")
        println("Наличие общежития: ${if (hasHostel) "Да" else "Нет"}")
    }
}


//  Класс для начальной школы ( от School)

class PrimarySchool(
    name: String,
    address: String,
    studentsCount: Int,
    schoolNumber: Int,
    hasUniform: Boolean,
    val hasPlayground: Boolean
) : School(name, address, studentsCount, schoolNumber, hasUniform) {

    override fun getType(): String = "Начальная школа"

    fun hasExtendedDayCare(): Boolean = true
}


// Класс для гимназии (от School)

class Gymnasium(
    name: String,
    address: String,
    studentsCount: Int,
    schoolNumber: Int,
    hasUniform: Boolean,
    val specialization: String
) : School(name, address, studentsCount, schoolNumber, hasUniform) {

    override fun getType(): String = "Гимназия"
}

// Задание 3: Иерархия Мебели


// класс для мебели

open class Furniture(
    val name: String,
    val material: String,
    val price: Double
) {
    open fun getCategory(): String = "Мебель"

    fun printDetails() {
        println("${getCategory()}: $name")
        println("Материал: $material")
        println("Цена: $price руб.")
    }
}


// Класс для сидячей мебели

open class SeatingFurniture(
    name: String,
    material: String,
    price: Double,
    val seatingCapacity: Int,
    val hasCushions: Boolean
) : Furniture(name, material, price) {

    override fun getCategory(): String = "Сидячая мебель"

    fun isComfortable(): Boolean = hasCushions
}


//Класс для мебели для хранения

open class StorageFurniture(
    name: String,
    material: String,
    price: Double,
    val shelvesCount: Int,
    val hasDoors: Boolean
) : Furniture(name, material, price) {

    override fun getCategory(): String = "Мебель для хранения"

    fun getStorageCapacity(): String {
        return when {
            shelvesCount >= 5 -> "Большая вместимость"
            shelvesCount >= 3 -> "Средняя вместимость"
            else -> "Малая вместимость"
        }
    }
}


//Класс для стула (от SeatingFurniture)

class Chair(
    name: String,
    material: String,
    price: Double,
    hasCushions: Boolean,
    val hasArmrests: Boolean,
    val isAdjustable: Boolean
) : SeatingFurniture(name, material, price, 1, hasCushions) {

    override fun getCategory(): String = "Стул"
}


//Класс для дивана (от SeatingFurniture)

class Sofa(
    name: String,
    material: String,
    price: Double,
    seatingCapacity: Int,
    hasCushions: Boolean,
    val isFoldable: Boolean
) : SeatingFurniture(name, material, price, seatingCapacity, hasCushions) {

    override fun getCategory(): String = "Диван"

    fun canBeUsedAsaBed(): Boolean = isFoldable
}


// Класс для шкафа (от StorageFurniture)

class Wardrobe(
    name: String,
    material: String,
    price: Double,
    shelvesCount: Int,
    hasDoors: Boolean,
    val hasMirror: Boolean,
    val drawersCount: Int
) : StorageFurniture(name, material, price, shelvesCount, hasDoors) {

    override fun getCategory(): String = "Шкаф"
}


// Класс для комода (от StorageFurniture)

class Dresser(
    name: String,
    material: String,
    price: Double,
    shelvesCount: Int,
    val drawersCount: Int
) : StorageFurniture(name, material, price, shelvesCount, false) {

    override fun getCategory(): String = "Комод"
}

// Задания 4-7: Контейнер Materials


//  Абстрактный класс контейнера материалов

abstract class Materials {
    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}


// Задание 4: Вставка материала на дно контейнера (индекс 0)

class InsertFirstMaterial : Materials() {

    fun insert(item: String) {
        val materials = extractMaterials()
        addMaterial(item)
        materials.forEach {
            addMaterial(it)
        }
    }
}

/**
 * Задание 5: Вставка списка материалов поочередно с существующими
 * Новые материалы появляются по индексам 0, 2, 4 и т.д.
 */
class InsertOneByOneMaterials : Materials() {

    fun insert(items: List<String>) {
        val materials = extractMaterials()
        val maxIndex = max(items.lastIndex, materials.lastIndex)
        for (i in 0..maxIndex) {
            if (i < items.size) {
                addMaterial(items[i])
            }
            if (i < materials.size) {
                addMaterial(materials[i])
            }
        }
    }
}


// Задание 6: Вставка материала с сортировкой всего списка в алфавитном порядке

class InsertSortedMaterials : Materials() {

    fun insert(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach {
            addMaterial(it)
        }
    }
}

/**
 * Задание 7: Вставка словаря - ключи в начало в обратном порядке,
 * потом существующие материалы, потом значения
 */
class InsertMapMaterials : Materials() {

    fun insert(items: Map<String, String>) {
        val materials = items.keys.reversed() + extractMaterials() + items.values
        materials.forEach {
            addMaterial(it)
        }
    }
}

// Main для тестирования

fun main() {
    println("Тестирование Геометрических Фигур \n")

    val circle = Circle("Красный", true, 5.0)
    circle.describe()
    println("Площадь: ${circle.getArea()}")
    println("Периметр: ${circle.getPerimeter()}\n")

    val triangle = Triangle("Синий", false, 3.0, 4.0, 5.0)
    triangle.describe()
    println("Тип: ${triangle.getType()}")
    println("Площадь: ${triangle.getArea()}\n")

    val rectangle = Rectangle("Зеленый", true, 4.0, 6.0)
    rectangle.describe()
    println("Площадь: ${rectangle.getArea()}")
    println("Квадрат?: ${rectangle.isSquare()}\n")

    println("Тестирование Учебных Заведений \n")

    val school = School("Школа №15", "ул. Ленина, 10", 500, 15, true)
    school.printSchoolInfo()
    println()

    val primarySchool = PrimarySchool("Начальная школа №5", "ул. Мира, 3", 200, 5, false, true)
    primarySchool.printSchoolInfo()
    println()

    val university = University("МГУ", "Ленинские горы, 1", 30000, 40, true)
    university.printUniversityInfo()
    println()

    println(" Тестирование Мебели \n")

    val chair = Chair("Офисный стул", "Кожа", 5000.0, true, true, true)
    chair.printDetails()
    println()

    val sofa = Sofa("Угловой диван", "Ткань", 35000.0, 5, true, true)
    sofa.printDetails()
    println("Можно использовать как кровать?: ${sofa.canBeUsedAsaBed()}\n")

    val wardrobe = Wardrobe("Шкаф-купе", "ДСП", 25000.0, 5, true, true, 3)
    wardrobe.printDetails()
    println("Вместимость: ${wardrobe.getStorageCapacity()}\n")

    println("Тестирование Materials\n")

    // Тест InsertFirstMaterial
    println("InsertFirstMaterial")
    val firstMaterial = InsertFirstMaterial()
    firstMaterial.addMaterial("Второй")
    firstMaterial.addMaterial("Третий")
    firstMaterial.insert("Первый")
    firstMaterial.printContainer()
    println()

    // Тест InsertOneByOneMaterials
    println("InsertOneByOneMaterials")
    val oneByOne = InsertOneByOneMaterials()
    oneByOne.addMaterial("A")
    oneByOne.addMaterial("B")
    oneByOne.addMaterial("C")
    oneByOne.insert(listOf("1", "2", "3"))
    oneByOne.printContainer()
    println()

    // Тест InsertSortedMaterials
    println("InsertSortedMaterials")
    val sorted = InsertSortedMaterials()
    sorted.addMaterial("Дерево")
    sorted.addMaterial("Алюминий")
    sorted.insert("Бетон")
    sorted.printContainer()
    println()

    // Тест InsertMapMaterials
    println("InsertMapMaterials")
    val mapMaterials = InsertMapMaterials()
    mapMaterials.addMaterial("Существующий1")
    mapMaterials.addMaterial("Существующий2")
    mapMaterials.insert(mapOf("Ключ1" to "Значение1", "Ключ2" to "Значение2"))
    mapMaterials.printContainer()
}