fun main() {
    val first = readln().toInt()
    val second = readln().toInt()

    if (second == 0) {
        println("Division by zero, please fix the second argument!")
    } else {
        println(first / second)
    }
}