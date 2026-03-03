fun main() {
    println("Enter the Shape You want to get output")
    val shape = readln()
    println("\n")
    println("==============================")

    for (i in 1..5) {
        for (j in 1..i) {
            print(shape)
        }
        println()
    }
}

