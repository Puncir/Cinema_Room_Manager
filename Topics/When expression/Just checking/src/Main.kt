fun main() {
    val number = readln().toInt()
    println(
        when(number) {
            1 -> " No!"
            2 -> " Yes!"
            3 -> " No!"
            4 -> " No!"
            else -> "Unknown number"
        }
    )
}