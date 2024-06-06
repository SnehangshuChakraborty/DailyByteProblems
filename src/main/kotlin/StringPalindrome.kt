package org.example

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