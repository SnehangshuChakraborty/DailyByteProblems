import org.example.isValidPalindrome
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
        assert(isValidPalindrome("racecar"))
        assert(isValidPalindrome("Racecar"))
        assert(isValidPalindrome("level"))
        assert(!isValidPalindrome("cat"))
        assert(!isValidPalindrome("Litti"))
    }
}