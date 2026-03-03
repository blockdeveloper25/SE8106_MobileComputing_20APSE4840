fun main() {
    println("Static vowel count: ${staticVowelCount()}")

    println("Enter a string:")
    println("Dynamic vowel count: ${dynamicVowelCount()}")
}

fun staticVowelCount(): Int {
    val text = "Kotlin Programming"
    var count = 0

    for (char in text.lowercase()) {
        if (char in "aeiou") {
            count++
        }
    }

    return count
}

fun dynamicVowelCount(): Int {
    val text = readLine()

    if (text != null && text.isNotEmpty()) {
        var count = 0
        for (char in text.lowercase()) {
            if (char in "aeiou") {
                count++
            }
        }
        return count
    }

    return 0
}