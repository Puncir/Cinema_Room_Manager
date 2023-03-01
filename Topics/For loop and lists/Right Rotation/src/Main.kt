fun main() {
    val sizeOfList = readln().toInt()
    val listOfNumbers = mutableListOf<Int>()
    repeat(sizeOfList) {
        val numbers = readln().toInt()
        listOfNumbers.add(numbers)
    }
    val positions = readln().toInt()
    val optimization = positions % sizeOfList
    if (optimization == 0) {
        println(listOfNumbers.joinToString(" "))
    } else {
        for (i in 0 until optimization){
            listOfNumbers.add(0, listOfNumbers[listOfNumbers.lastIndex])
            listOfNumbers.removeAt(listOfNumbers.lastIndex)
        }
        println(listOfNumbers.joinToString(" "))
    }
}