import org.example.isCapitalizationCorrectBruteForce
import org.example.isCapitalizationCorrectUsingCustomLibrary
import org.junit.jupiter.api.Test

class CapitalizationCorrectTest {

    @Test
    fun `test isCapitalizationCorrectUsingCustomLibrary`() {
        assert(isCapitalizationCorrectUsingCustomLibrary("Abcde"))
        assert(isCapitalizationCorrectUsingCustomLibrary("test"))
        assert(isCapitalizationCorrectUsingCustomLibrary("TEST"))
        assert(!isCapitalizationCorrectUsingCustomLibrary("ABcd"))
        assert(!isCapitalizationCorrectUsingCustomLibrary("TeSt"))
        assert(!isCapitalizationCorrectUsingCustomLibrary("tesT"))
    }

    @Test
    fun `test isCapitalizationCorrectBruteForce`() {
        assert(isCapitalizationCorrectBruteForce("Abcde"))
        assert(isCapitalizationCorrectBruteForce("test"))
        assert(isCapitalizationCorrectBruteForce("TEST"))
        assert(!isCapitalizationCorrectBruteForce("ABcd"))
        assert(!isCapitalizationCorrectBruteForce("TeSt"))
        assert(!isCapitalizationCorrectBruteForce("tesT"))
    }
}