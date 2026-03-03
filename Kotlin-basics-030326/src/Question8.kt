fun main() {
    val numbers = listOf(-2, 4, -1, 6, 3, -5)
    var sum = 0

    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("Sum of positive numbers: $sum")
}