package string

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTest {
    val inputArray = arrayOf("colorado", "color", "cold")

    @Test
    fun `test longestCommonPrefixBruteForce with valid input`() {
        val inputArray = arrayOf("flower", "flow", "flight")
        val expectedPrefix = "fl"
        val actualPrefix = longestCommonPrefixBruteForce(inputArray)
        assertEquals(expectedPrefix, actualPrefix)
    }

    @Test
    fun `test longestCommonPrefixOptimised with valid input`() {
        val inputArray = arrayOf("flower", "flow", "flight")
        val expectedPrefix = "fl"
        val actualPrefix = longestCommonPrefixOptimised(inputArray)
        assertEquals(expectedPrefix, actualPrefix)
    }

}