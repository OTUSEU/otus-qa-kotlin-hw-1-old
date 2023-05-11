package hw01_testrunner

fun main() {
    val steps = Steps()
    val runner = Runner<Any>()
// Можно переписать в DSL - будет изящнее
   // runner.runTest(steps = steps) { runnerTest() }
    Runner<Steps>().runTest(steps = Steps()) { runnerTest() }
    Runner<Steps0>().runTest(steps = Steps0()) { runnerTest() }
}

fun runnerTest() {
    println("Testing...")
}