package string

/*
Given a string and
the ability to delete at most one character, return whether it can form a palindrome,

Ex:
"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false
*/

/*
This should be an extension to the normal Palindrome question,
Just add a method for removing characters in case string is not palindrome
*/
fun isPalindrome(input: String): Boolean {

    if (input.isEmpty()) return false
    val normalisedInput = input.sanitizeString()
    return normalisedInput.isValidPalindrome()

}

fun String.sanitizeString(): CharArray {
    return this
        .lowercase()
        .filter { it.isLetterOrDigit() }
        .toCharArray()
}

fun CharArray.isValidPalindrome(): Boolean {
    var start = 0
    var end = this.size-1

    while (start < end) {
        if (this[start] != this[end]) {
            return checkSubstringForPalindrome(start+1, end, this) ||
                    checkSubstringForPalindrome(start, end-1, this)
        }
        start++
        end--
    }
    return true
}

fun checkSubstringForPalindrome(start: Int, end: Int, chars: CharArray): Boolean {
    var left = start
    var right = end

    while (left < right) {
        if (chars[left] != chars[right]) return false
        left++
        right--
    }
    return true
}
