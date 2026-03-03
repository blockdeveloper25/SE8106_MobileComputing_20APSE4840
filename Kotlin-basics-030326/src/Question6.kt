fun main() {
    val words = listOf("Apple", "Banana", "Cherry")
    val reversedList = mutableListOf<String>()

    for (i in words.size - 1 downTo 0) {
        reversedList.add(words[i])
    }
    println("Words Size: ${reversedList.size}")
    println("Reversed list: $reversedList")
}