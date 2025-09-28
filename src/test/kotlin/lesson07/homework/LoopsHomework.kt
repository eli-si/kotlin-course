package lesson07.homework

import java.math.BigInteger



// 1) Числа 1..5
    fun forDirectRange1to5() {
        for (i in 1..5) {
            print("$i ")
        }
        println()
    }

    // 2) Чётные числа 1..10
    fun forEven1to10() {
        for (i in 2..10 step 2) {
            print("$i ")
        }
        println()
    }

    /* Обратный диапазон (for)       */

    // 3 Числа 5..1
    fun forReverse5to1() {
        for (i in 5 downTo 1) {
            print("$i ")
        }
        println()
    }

    // 4 Числа 10..1 с шагом -2
    fun forReverse10to1Step2() {
        for (i in 10 downTo 1 step 2) {
            print("$i ")
        }
        println()
    }

    /* С шагом (step) */

    // 5 Шаг 2: 1..9
    fun forStep2_1to9() {
        for (i in 1..9 step 2) {
            print("$i ")
        }
        println()
    }

    // 6 Каждое третье число 1..20
    fun forEveryThird1to20() {
        for (i in 1..20 step 3) {
            print("$i ")
        }
        println()
    }

    /* until (верхняя граница НЕ включается) */

    // 7 От 3 до size НЕ включая size, шаг 2
    fun forFrom3UntilSizeStep2(size: Int) {
        if (size <= 3) {
            println("Nechego vyvodit': size ($size) dolzhen byt' > 3.")
            return
        }
        for (i in 3 until size step 2) {
            print("$i ")
        }
        println()
    }

    /* while */

    // 8 Квадраты 1..5
    fun whileSquares1to5() {
        var i = 1
        while (i <= 5) {
            print("${i * i} ")
            i++
        }
        println()
    }

    // 9 Уменьшаем число от 10 до 5, затем печатаем результат
    fun whileDecrement10to5AndPrintResult() {
        var x = 10
        while (x > 5) {
            x-- // 10→9→8→7→6→5, на 5 выходим
        }
        println("Resultat: $x")
    }

    /*      do-while */

    // 10 Вывести 5..1
    fun doWhile5to1() {
        var i = 5
        do {
            print("$i ")
            i--
        } while (i >= 1)
        println()
    }

    // 11 Повторять, пока счётчик < 10, начиная с 5
    fun doWhileFrom5Until10() {
        var c = 5
        do {
            print("$c ")
            c++
        } while (c < 10)
        println()
    }

    /*     break / continue */

    // 12) for 1..10, выйти при достижении 6
    fun forBreakAt6() {
        for (i in 1..10) {
            if (i == 6) break
            print("$i ")
        }
        println()
    }

    // 13 while бесконечный с прерыванием на 10
    fun whileInfiniteBreakAt10() {
        var i = 1
        while (true) {
            print("$i ")
            if (i == 10) break
            i++
        }
        println()
    }

    // 14 for 1..10, пропускать чётные (continue)
    fun forSkipEvens1to10() {
        for (i in 1..10) {
            if (i % 2 == 0) continue
            print("$i ")
        }
        println()
    }

    // 15 while 1..10, пропускать кратные 3
    fun whileSkipMultiplesOf3() {
        var i = 1
        while (i <= 10) {
            if (i % 3 == 0) {
                i++
                continue
            }
            print("$i ")
            i++
        }
        println()
    }


fun main() {

    forDirectRange1to5()
    forEven1to10()


    forReverse5to1()
    forReverse10to1Step2()


    forStep2_1to9()
    forEveryThird1to20()


    forFrom3UntilSizeStep2(size = 11)
    forFrom3UntilSizeStep2(size = 3)


    whileSquares1to5()
    whileDecrement10to5AndPrintResult()


    doWhile5to1()


    forBreakAt6()
    doWhileFrom5Until10()
    whileInfiniteBreakAt10()
    forSkipEvens1to10()
    whileSkipMultiplesOf3()













}