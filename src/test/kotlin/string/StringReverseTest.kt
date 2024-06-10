package string

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringReverseTest {

    @Test
    fun testStringReverse() {
        val noun = stringReversed("cat")
        assertEquals("tac", noun)
        val sentence = stringReversed("How u doin")
        assertEquals("niod u woH", sentence)
    }

    @Test
    fun testStringReversedWithoutLibrary() {
        val result = stringReversedWithoutLibrary("cat")
        assertEquals("tac", result)
        val sentence = stringReversedWithoutLibrary("How u doin")
        assertEquals("niod u woH", sentence)
    }
}