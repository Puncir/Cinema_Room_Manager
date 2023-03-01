const val G_Gravity = 9.8

fun main() {
    val p = readln().toDouble()
    val h = readln().toDouble()
    println(p * h * G_Gravity)
}