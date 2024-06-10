package string

import java.util.Locale

fun isCapitalizationCorrectUsingCustomLibrary(inputString: String): Boolean {
    val firstChar = inputString.firstOrNull()
    return when {
        inputString.isEmpty() -> true
        firstChar?.isUpperCase() == true && inputString.drop(1).all { it.isLowerCase() } -> true
        inputString == inputString.uppercase(Locale.getDefault()) -> true
        inputString == inputString.lowercase(Locale.getDefault()) -> true
        else -> false
    }
}

fun isCapitalizationCorrectBruteForce(inputString: String): Boolean {
    val firstChar = inputString.firstOrNull()
    val restOfTheString = inputString.drop(1)

    return when {
        inputString.isEmpty() -> true
        inputString == inputString.uppercase(Locale.getDefault()) -> true
        inputString == inputString.lowercase(Locale.getDefault()) -> true
        firstChar!!.isUpperCase() && restOfTheString == restOfTheString.toLowerCase() -> true
        else -> false
    }
}

