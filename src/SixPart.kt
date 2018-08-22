fun main (args :Array<String>){

    //Reviewing the last subject Nullability
    println(divideIfWhole(10, 2))
    println(divideIfWhole(10, 3))
    println(divideIfWhole(10000, 2))
    println(divideIfWhole(345, 5))


}

//This function will be checking if the value is divisible of divisor if not return null
fun divideIfWhole(value :Int, divisor:Int) :Int? {

    val quotient = value / divisor
    val remainder = value % divisor

    return if (remainder == 0) quotient else null
}