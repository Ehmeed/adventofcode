package org.ehmeed.adventofcode.year2019

import org.amshove.kluent.shouldEqual
import org.junit.Test

class Day2Test {

    @Test
    fun `part 1`() {
        Day2.decode("1,0,0,0,99") shouldEqual "2,0,0,0,99"
        Day2.decode("2,3,0,3,99") shouldEqual "2,3,0,6,99"
        Day2.decode("2,4,4,5,99,0") shouldEqual "2,4,4,5,99,9801"
    }

    @Test
    fun `part 1 end early`() {
        Day2.decode("1,1,1,4,99,5,6,0,99") shouldEqual "30,1,1,4,2,5,6,0,99"
    }
}
