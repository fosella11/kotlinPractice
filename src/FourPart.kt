fun main (args: Array<String>) {

  var calculatorFun = ::calculatorTwoNumbersB

    printerResultCalculators(calculatorFun, "sum",15,15)
}

//Do Functions! :)
fun calculatorTwoNumbersB(a: String, b: Int, c: Int) : String{
    val result = when{
        a == "sum" ->  "The $a between $b and $c is: ${b + c}"
        a == "sub" -> "The $a between $b and $c is: ${b - c}"
        a == "mul" -> "The $a between $b and $c is: ${b * c}"
        a == "div" -> "The $a between $b and $c is: ${b / c}"
        else -> "Operation unknown"
    }
    return result
}

fun printerResultCalculators(function :(s: String, a: Int, b: Int) -> String,s:String, a: Int, b: Int){
    println(function(s,a,b))
}