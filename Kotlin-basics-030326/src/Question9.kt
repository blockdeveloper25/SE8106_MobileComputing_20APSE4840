fun main() {
    val correctNumber = 7
    var guess: Int?
// Iterative Loop
    do {
        println("Guess a number between 1 and 10:")
        guess = readLine()?.toIntOrNull()

        if (guess != correctNumber) {
            println("Wrong guess. Try again!")
        }

    } while (guess != correctNumber)

    println("Correct! 🎉")
}