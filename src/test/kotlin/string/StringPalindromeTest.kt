package string

import org.junit.jupiter.api.Test

class StringPalindromeTest {

    @Test
    fun `test isValidPalindrome`() {
        assert(isValidPalindrome("racecar"))
        assert(isValidPalindrome("Racecar"))
        assert(isValidPalindrome("level"))
        assert(!isValidPalindrome("cat"))
        assert(!isValidPalindrome("Litti"))
    }

    @Test
    fun `test isValidPalindromeWithoutRegex`() {
        assert(isValidPalindromeWithoutRegex("racecar"))
        assert(isValidPalindromeWithoutRegex("Racecar"))
        assert(isValidPalindromeWithoutRegex("level"))
        assert(!isValidPalindromeWithoutRegex("cat"))
        assert(!isValidPalindromeWithoutRegex("Litti"))
    }

    @Test
    fun `test isValidPalindromeWithoutLibrary`() {
        assert(isValidPalindromeWithoutLibrary("racecar"))
        assert(isValidPalindromeWithoutLibrary("Racecar"))
        assert(isValidPalindromeWithoutLibrary("level"))
        assert(!isValidPalindromeWithoutLibrary("cat"))
        assert(!isValidPalindromeWithoutLibrary("Litti"))
    }
}