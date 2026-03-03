fun main() {
    staticLarge()
    dynamicLarge()
}

fun staticLarge() {
    val numbers = listOf(10, 45, 3, 99, 23)

    var largest = numbers[0]

    for (num in numbers) {
        if (num > largest) {
            largest = num
        }
    }

    println("Static Largest number: $largest")
}

fun dynamicLarge() {
    println("Enter numbers separated by spaces:")

    val input = readLine()
    val numbers = input
        ?.split(" ")
        ?.mapNotNull { it.toIntOrNull() }

    if (numbers != null && numbers.isNotEmpty()) {
        var largest = numbers[0]

        for (num in numbers) {
            if (num > largest) {
                largest = num
            }
        }

        println("Dynamic Largest number: $largest")
    } else {
        println("Invalid input")
    }
}