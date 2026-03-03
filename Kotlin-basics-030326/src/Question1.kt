fun main() {
    // Static
    staticEvenSum()
    // dynamic
    dynamicEvenSum()


}

fun staticEvenSum () {

        val numbers = listOf(1, 2, 3, 4, 5)

        val sumOfEven = numbers
            .filter { it % 2 == 0 }
            .sum()

        println("Sum of even numbers: $sumOfEven")
}

fun dynamicEvenSum() {

    println("Enter numbers separated by spaces:")
    val input = readLine()
    val numbers = input
        ?.split(" ")
        ?.mapNotNull { it.toIntOrNull() }

    if (numbers != null) {
        val sumOfEven = numbers.filter { it % 2 == 0 }.sum()
        println("Sum of even numbers: $sumOfEven")
    } else {
        println("Invalid input")
    }
}