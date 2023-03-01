package cinema


fun main() {
    var currentIncome = 0
    var tickets = 0
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()
    val totalSeats = rows * seats
    val planOfRoom = MutableList(rows) { MutableList(seats) {"S"} }

    do {
        println("""
            1. Show the seats
            2. Buy a ticket
            3. Statistics
            0. Exit        
        """.trimIndent())
        val position = readln().toInt()
        when (position) {
            1 -> cinemaRoom(planOfRoom, rows, seats)
            2 -> {
                do {
                    println("Enter a row number:")
                    val row = readln().toInt()
                    println("Enter a seat number in that row:")
                    val seat = readln().toInt()
                    if (row > rows || seat > seats) {
                        println("Wrong input!")
                    } else if (planOfRoom[row - 1][seat - 1] == "B") {
                        println("That ticket has already been purchased!")
                    } else {
                        planOfRoom[row - 1][seat - 1] = "B"

                        val ticketPrice = if (totalSeats > 60) {
                            if (row in 1..rows / 2) {
                                10
                            } else {
                                8
                            }
                        } else {
                            10
                        }
                        println("Ticket price: $$ticketPrice")

                        currentIncome += ticketPrice
                        tickets++
                        break
                    }
                } while(true)
            }
            3 -> {
                println("Number of purchased tickets: $tickets")

                val percentOfAll = (tickets * 100.0) / (totalSeats)
                println("Percentage: ${"%.2f".format(percentOfAll)}%")

                println("Current income: $$currentIncome")

                val totalIncome = if (totalSeats > 60) {
                    ((rows / 2) * seats * 10) + ((rows - rows / 2) * seats * 8)
                } else {
                    totalSeats * 10
                }
                println("Total income: $$totalIncome")
            }
            0 -> break
        }
    } while(true)
}

fun cinemaRoom (list: MutableList<MutableList<String>>, rows: Int, seats: Int) {
    println("Cinema:")
    print(" ")
    for (i in 1..seats){
        print(" $i")
    }
    for (j in 1..rows) {
        print("\n" + j)
        for (g in 0 until seats){
            print(" ${list[j - 1][g]}")
        }
    }
    println("\n")
}