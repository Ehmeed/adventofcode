package org.ehmeed.adventofcode.year2019

import java.lang.IllegalArgumentException

private fun main() {
    val finalState = Day2.decode(inputCode)
    println("Final state is: $finalState")

    (100 downTo 0).forEach { verb ->
        (100 downTo 0).forEach { noun ->
            val code = inputCode.split(",").toMutableList()
            code[1] = noun.toString()
            code[2] = verb.toString()
            val decoded = Day2.decode(code.joinToString(","))
            if (decoded.split(",").first() == "19690720") {
                println("Second part result: ${noun * 100 + verb}")
            }
        }
    }
}

object Day2 {
    fun decode(inputCode: String): String {
        val parsedInput = inputCode.split(",").map { it.toInt() }
        var position = 0
        var result = parsedInput
        while (position < result.size) {
            val (updatedState, shouldStop) = execute(result, result.drop(position).take(4))
            if (shouldStop) break
            result = updatedState
            position += 4
        }

        return result.joinToString(",")
    }

    private fun execute(state: List<Int>, chunk: List<Int>): Pair<List<Int>, Boolean> = when(chunk[0]) {
        1 -> execute(state, chunk[1], chunk[2], chunk[3]) { a, b -> a + b } to false
        2 -> execute(state, chunk[1], chunk[2], chunk[3]) { a, b -> a * b } to false
        99 -> state to true
        else -> throw IllegalArgumentException("Unknown operand")
    }

    private fun execute(state: List<Int>, op1: Int, op2: Int, store: Int, operation: (Int, Int) -> Int): List<Int> {
        val result = operation(state[op1], state[op2])
        val resultState = state.toMutableList()
        resultState[store] = result
        return resultState
    }
}

private val inputCode = "1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,9,19,1,19,5,23,2,6,23,27,1,6,27,31,2,31,9,35,1,35,6,39,1,10,39,43,2,9,43,47,1,5,47,51,2,51,6,55,1,5,55,59,2,13,59,63,1,63,5,67,2,67,13,71,1,71,9,75,1,75,6,79,2,79,6,83,1,83,5,87,2,87,9,91,2,9,91,95,1,5,95,99,2,99,13,103,1,103,5,107,1,2,107,111,1,111,5,0,99,2,14,0,0"
