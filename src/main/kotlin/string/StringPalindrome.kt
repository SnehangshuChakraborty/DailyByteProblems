package org.example.string

import java.util.Locale

fun isValidPalindrome(input: String): Boolean {

    // Sanitize input parameters
    val normalizedInput = input
        .lowercase(Locale.getDefault())
        .replace(Regex("[^a-zA-Z0-9]"), "")

    return normalizedInput == normalizedInput.reversed()
}

fun isValidPalindromeWithoutRegex(input: String): Boolean {
    val normalizedInput = input
        .lowercase(Locale.getDefault())
        .filter { it.isLetterOrDigit() }

    return normalizedInput == normalizedInput.reversed()
}

fun isValidPalindromeWithoutLibrary(input: String): Boolean {
    val normalizedInput = input.normalizedInput()
    return normalizedInput.isPalindrome()
}

fun String.normalizedInput(): CharArray {
    return this
        .lowercase(Locale.getDefault())
        .filter { it.isLetterOrDigit() }
        .toCharArray()
}

fun CharArray.isPalindrome(): Boolean {
    var start = 0
    var end = this.size - 1
    while (start < end) {
        if (this[start] != this[end]) {
            return false
        }
        start++
        end--
    }
    return true
}