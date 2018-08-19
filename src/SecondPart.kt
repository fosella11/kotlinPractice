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


    //Factorial using "For loop"

    println("""
       Factorial with For Loop-----------
    """)
    val input1 = 5
    var factorial1 = 1

    // input 1 - factorial = 1
    // input 2 - factorial = 2
    // input 3 - factorial = 6

    //Comment
    //
    //Important
    //
    //We can use step on loop, for example for(index1 in 1..input1 step 2)
    //and the index is 1 3 5 7 9 11
    //
    //

    for(index1 in 1..input1){
        factorial1 *= index1
    }
    println("The factorial of $input1 is $factorial1")

}