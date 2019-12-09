package org.ehmeed.adventofcode.year2019

import org.amshove.kluent.shouldEqual
import org.junit.Test

class Day3Test {

    @Test
    fun `tc1`() {
        val wirePaths = """
            R75,D30,R83,U83,L12,D49,R71,U7,L72
            U62,R66,U55,R34,D71,R55,D58,R83
        """.trimIndent()
        Day3.getClosestCrossingPointManhattanDistance(wirePaths) shouldEqual 159
    }

    @Test
    fun `tc2`() {
        val wirePaths = """
            R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51
            U98,R91,D20,R16,D67,R40,U7,R15,U6,R7
        """.trimIndent()
        Day3.getClosestCrossingPointManhattanDistance(wirePaths) shouldEqual 135
    }

    @Test
    fun `part2 tc1`() {
        val wirePaths = """
            R75,D30,R83,U83,L12,D49,R71,U7,L72
            U62,R66,U55,R34,D71,R55,D58,R83
        """.trimIndent()

        Day3.getCombinedStepsToClosesIntersection(wirePaths) shouldEqual 610
    }

    @Test
    fun `part2 tc2`() {
        val wirePaths = """
        R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51
        U98,R91,D20,R16,D67,R40,U7,R15,U6,R7
        """.trimIndent()

        Day3.getCombinedStepsToClosesIntersection(wirePaths) shouldEqual 410
    }

}
