fun main (args: Array<String>) {

    //First Define the function as variable
  var calculatorFun = ::calculatorTwoNumbersB

    //Last step
    printerResultCalculators(calculatorFun, "sum",15,15)

    //Check if number is prime
    val numeroTest = 3
    println("El numero $numeroTest es primo: ${isPrime(numeroTest)}")
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

//This is a form to declare and use the function like variable
//
//function :(s: String, a: Int, b: Int) -> String,s:String, a: Int, b: Int
//
fun printerResultCalculators(function :(s: String, a: Int, b: Int) -> String,s:String, a: Int, b: Int){
    println(function(s,a,b))
}


//Function to know if a number is prime or not

fun isPrime(numeroAnalyze: Int): Boolean{

    var isPrime = true
    for(index in 2..numeroAnalyze/2){
        println("Index:"+index)
        println("Index:"+numeroAnalyze + "///numeroAnalyze % index"+numeroAnalyze % index)
        if(numeroAnalyze % index == 0){
            isPrime = false
            break
        }
    }
    return isPrime
}
