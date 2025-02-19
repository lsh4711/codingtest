//  A+B - 4

fun main(args: Array<String>) {
    while (true) {
        val input = readlnOrNull()

        if (input === null) {
            return
        }

        val (A, B) = input.split(" ").map { it.toInt() }

        handleCase(A, B)
    }
}

private fun handleCase(A: Int, B: Int) {
    println(A + B)
}
