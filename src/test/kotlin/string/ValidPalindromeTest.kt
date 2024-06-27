package string

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ValidPalindromeTest {

    @Test
    fun `test isPalindrome`() {
        assertEquals(isPalindrome("foobof"), true)
        assertEquals(isPalindrome("abcba"), true)
        assertEquals(isPalindrome("abccab"), false)
        assertEquals(isPalindrome("bddb"), true)
    }
}