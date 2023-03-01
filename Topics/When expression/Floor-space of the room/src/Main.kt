fun main() {    
    val shape = readln()
    when (shape) {
        "triangle" -> {
            val aSide = readln().toDouble()
            val bSide = readln().toDouble()
            val cSide = readln().toDouble()
            val sPerimeter = (aSide + bSide + cSide) / 2
            val aArea = Math.sqrt(sPerimeter * (sPerimeter - aSide) * (sPerimeter - bSide) * (sPerimeter - cSide))
            println(aArea)
        }
        "rectangle" -> {
            val aSide = readln().toDouble()
            val bSide = readln().toDouble()
            println(aSide * bSide)
        }
        "circle" -> {
            val rRadius = readln().toDouble()
            println(3.14 * rRadius * rRadius)
        }
    }
}