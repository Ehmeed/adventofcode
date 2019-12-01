package org.ehmeed.adventofcode.year2019

import org.amshove.kluent.shouldEqual
import org.junit.Test

class Day1Test {

    @Test
    fun `calculate fuel test`() {
        Day1.calculateFuel(12) shouldEqual 2
        Day1.calculateFuel(14) shouldEqual 2
        Day1.calculateFuel(1969) shouldEqual 654
        Day1.calculateFuel(100756) shouldEqual 33583
    }

    @Test
    fun `calculate fuel considering fuel weight test`() {
        Day1.calculateFuelConsideringFuelWeight(14) shouldEqual 2
        Day1.calculateFuelConsideringFuelWeight(1969) shouldEqual 966
        Day1.calculateFuelConsideringFuelWeight(100756) shouldEqual 50346
    }
}
