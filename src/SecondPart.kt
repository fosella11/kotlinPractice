fun main (args : Array<String>){
    // Ranges
    val closedRang = 0..5 // 1 2 3 4 5
    val halfOpenRang = 0 until 5 // 0 1 2 3 4
    val decreseRan = 0 downTo  5 // 5 4 3 2 1

    println("Closed Range 5[0,5] -- using 0..5")
    for (i in closedRang){
        print("n $i |")
    }
    println()
    println("Half Open Range 5[0,5) -- using until")
    for (i in halfOpenRang){
        print("n $i |")
    }
    println()
    println("Half Open Range 5[5,0] using downTo")
    for (i in decreseRan){
        print("n $i |")
    }
    println()

}