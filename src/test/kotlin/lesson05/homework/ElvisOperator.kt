package lesson05.homework



fun main() {
    // Задача 1
    val baseIntensity: Double = 3.0
    val coefficient: Double? = 0.73
    val defaultCoefficient: Double = 0.5

    val usedCoefficient: Double = coefficient ?: defaultCoefficient
    val resultIntensity: Double = baseIntensity * usedCoefficient

    println("Task 1: usedCoefficient=$usedCoefficient, resultIntensity=$resultIntensity")

    // Задача 2

    val defaultCost: Double = 50.0
    val cost: Double? = 20.0
    val deliveryCost: Double = 5.0
    val insuranceCoefficient: Double = 0.005

    val insuredBase: Double = cost ?: defaultCost
    val insuranceCost: Double = insuredBase * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost

    println("Task 2: insuredBase=$insuredBase, insuranceCost=$insuranceCost, totalCost=$totalCost")

    // Задача 3

    val pressure: String? = "34.6"
    val attentionMessage = "Attention, pressure is lost"


    val pressureForLab: String = pressure ?: error(attentionMessage)

    println("Task 3: pressureForLab=$pressureForLab")
}
