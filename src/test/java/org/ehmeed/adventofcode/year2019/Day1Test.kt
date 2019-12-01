package org.ehmeed.adventofcode.year2019

import org.amshove.kluent.shouldEqual
import org.junit.Test

class Day1Test {

    @Test
    fun `calculate mass test`() {
        Day1.calculateFull(12) shouldEqual 2
        Day1.calculateFull(14) shouldEqual 2
        Day1.calculateFull(1969) shouldEqual 654
        Day1.calculateFull(100756) shouldEqual 33583
    }
}
