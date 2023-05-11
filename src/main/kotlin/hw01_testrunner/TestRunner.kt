package hw01_testrunner

interface TestRunner <T> {
    fun  runTest(steps: T, test: () -> Unit)
}