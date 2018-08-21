fun main (args : Array<String>){

    //Other method to create FIZZ & BUZZ :)

    for (i in 0..100 step 1){
        val response = when {
            i % 3 == 0 && i % 5 == 0 -> "is FIZZ and BUZZ"
            i % 3 == 0 -> "is FIZZ"
            i % 5 == 0 -> "is BUZZ"
            else -> "Not Fizz and BUZZ"
        }
        print("$i $response ||")
    }

    println("""
           Testing Calculator -----------------
        """)

    calculatorTwoNumbers("sum", 15, 15)
    calculatorTwoNumbers("div", 15, 15)
    calculatorTwoNumbers("sub", 15, 15)
    calculatorTwoNumbers("mul", 15, 15)


}
//Do Functions! :)
fun calculatorTwoNumbers(a: String, b: Int, c: Int){
    val result = when{
        a == "sum" ->  "The $a between $b and $c is: ${b + c}"
        a == "sub" -> "The $a between $b and $c is: ${b - c}"
        a == "mul" -> "The $a between $b and $c is: ${b * c}"
        a == "div" -> "The $a between $b and $c is: ${b / c}"
        else -> "Operation unknown"
    }
    println(result)
}