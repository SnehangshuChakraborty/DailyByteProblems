package string

import org.example.string.vacuumCleanerRouteBruteForce
import org.example.string.vacuumCleanerRouteOptimized
import org.junit.jupiter.api.Test

class VacuumCleanerPositionTest {

    @Test
    fun `test vacuumCleanerRouteBruteForce`() {
        assert(vacuumCleanerRouteBruteForce("LR"))
        assert(vacuumCleanerRouteBruteForce("LRRL"))
        assert(vacuumCleanerRouteBruteForce("LLRR"))
        assert(!vacuumCleanerRouteBruteForce("LRU"))
        assert(!vacuumCleanerRouteBruteForce("LLL"))
        assert(!vacuumCleanerRouteBruteForce("UUD"))
    }

    @Test
    fun `test vacuumCleanerRouteOptimized`() {
        assert(vacuumCleanerRouteOptimized("LR"))
        assert(vacuumCleanerRouteOptimized("LRRL"))
        assert(vacuumCleanerRouteOptimized("LLRR"))
        assert(!vacuumCleanerRouteOptimized("LRU"))
        assert(!vacuumCleanerRouteOptimized("LLL"))
        assert(!vacuumCleanerRouteOptimized("UUD"))
    }
}