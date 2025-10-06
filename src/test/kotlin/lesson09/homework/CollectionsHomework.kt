package lesson09.homework

fun main() {
    // массивы
    val arr1 = arrayOf(1, 2, 3, 4, 5)
    println("arr1=" + arr1.joinToString())

    val arr2 = Array(10) { "" }
    println("arr2=" + arr2.joinToString())

    val arr3 = Array(5) { i -> i * 2.0 }
    println("arr3=" + arr3.joinToString())

    val arr4 = Array(5) { i -> i * 3 }
    println("arr4=" + arr4.joinToString())

    val arr5 = arrayOf<String?>(null, "один", "два")
    println("arr5=" + arr5.joinToString())

    // копия массива
    val src = arrayOf(1, 2, 3, 4)
    val copy = Array(src.size) { i -> src[i] }
    println("src=" + src.joinToString())
    println("copy=" + copy.joinToString())

    // разница массивов
    val a = arrayOf(10, 20, 30)
    val b = arrayOf(1, 2, 3)
    val diff = Array(a.size) { i -> a[i] - b[i] }
    println("diff=" + diff.joinToString())

    // индекс элемента 5
    val arr6 = arrayOf(2, 3, 5, 7, 11)
    var idx = -1
    var i = 0
    while (i < arr6.size) {
        if (arr6[i] == 5) {
            idx = i
            break
        }
        i++
    }
    println("index of 5 in arr6=$idx")

    // чёт/нечёт
    val arr7 = arrayOf(1, 2, 3, 4, 5, 6)
    for (n in arr7) {
        val t = if (n % 2 == 0) "чётное" else "нечётное"
        println("$n -> $t")
    }

    // поиск подстроки
    val words = arrayOf("кот", "собака", "корова")
    println("contains 'ко' in words:")
    findContains(words, "ко")

    // списки
    val l1 = listOf<Int>()
    println("l1=$l1")

    val l2 = listOf("Hello", "World", "Kotlin")
    println("l2=$l2")

    val l3 = mutableListOf(1, 2, 3, 4, 5)
    println("l3 start=$l3")
    l3.addAll(listOf(6, 7, 8))
    println("l3 after add=$l3")

    val l4 = mutableListOf("Hello", "World", "Kotlin")
    println("l4 start=$l4")
    l4.remove("World")
    println("l4 after remove=$l4")

    val l5 = listOf(9, 8, 7)
    for (x in l5) println("l5 element=$x")

    val l6 = listOf("a", "b", "c")
    println("l6 second=" + l6[1])

    val l7 = mutableListOf(1, 2, 3, 4)
    println("l7 before=$l7")
    l7[2] = 99
    println("l7 after=$l7")

    val l8 = listOf("one", "two")
    val l9 = listOf("three", "four")
    val combined = mutableListOf<String>()
    for (s in l8) combined.add(s)
    for (s in l9) combined.add(s)
    println("combined=$combined")

    val l10 = listOf(5, 1, 7, 3)
    var min = l10.first()
    var max = l10.first()
    for (n in l10) {
        if (n < min) min = n
        if (n > max) max = n
    }
    println("min=$min max=$max")

    val l11 = listOf(1, 2, 3, 4, 5, 6)
    val evens = mutableListOf<Int>()
    for (n in l11) if (n % 2 == 0) evens.add(n)
    println("evens from l11=$evens")

    // множества
    val s1 = setOf<Int>()
    println("s1=$s1")

    val s2 = setOf(1, 2, 3)
    println("s2=$s2")

    val s3 = mutableSetOf("Kotlin", "Java", "Scala")
    println("s3 start=$s3")
    s3.add("Swift")
    s3.add("Go")
    println("s3 after add=$s3")

    val s4 = mutableSetOf(1, 2, 3)
    println("s4 start=$s4")
    s4.remove(2)
    println("s4 after remove=$s4")

    val s5 = setOf(10, 20, 30)
    for (n in s5) println("s5 element=$n")

    val check = checkContains(setOf("кот", "собака"), "собака")
    println("checkContains='собака' -> $check")

    val s6 = setOf("red", "green", "blue")
    val listFromSet = mutableListOf<String>()
    for (x in s6) listFromSet.add(x)
    println("listFromSet=$listFromSet")
}

fun findContains(arr: Array<String>, needle: String) {
    for (x in arr) if (x.contains(needle)) println("found: $x")
}

fun checkContains(set: Set<String>, needle: String): Boolean {
    for (x in set) if (x == needle) return true
    return false
}
