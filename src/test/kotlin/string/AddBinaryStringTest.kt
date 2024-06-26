package string

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddBinaryStringTest {

    @Test
    fun `test addBinaryBitByBit`() {
        assertEquals(addBinaryBitByBit("100","1"), "101")
        assertEquals(addBinaryBitByBit("11","1"), "100")
        assertEquals(addBinaryBitByBit("110","1"), "111")
    }
}