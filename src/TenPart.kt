fun main (args :Array<String>){

    //Lambda :) Or Anonymous function
    /*With Lambda we can to reduce the code
    * We can optimize the logic thet we have to use one time in specific case
    * for example if we need to process a array of elements, we must use a lambda, not a method to use unique time...
    * We need reduce the complex of own code
    * Also We can send functions like a argument
    * We can define the lambda near to part of code to use - Easy to read
    */

    //Define
    val addLambda : (Int , Int) -> Int

    addLambda = {a:Int , b:Int -> Int
        a+b
    }
    println(addLambda(5,5)) //10

    val squareLambda = { a:Int -> Int
        a * a
    }

    println(squareLambda(10)) //100

    //If we have a 1 parameter or argument we can use """" it """"

    val squareLmabdaOneArgument  :(Int) -> Int = {
    it * it
    }

    println(squareLmabdaOneArgument(10)) //100


    //We can pass a operation in function
    printResult(5,5, addLambda) //10


    //We can use a lambda expression

    //example array
    val leters = arrayOf("a","b","c","d","e")

    leters.forEach { println(" $it |") }

    val letersWithoutA = leters.filter { it != "a" }
    println(letersWithoutA) // b c d e


    //Example using Lambda

    var counter1 = 0

    val incementCounter1 = {
        counter1 += 1
    }

    incementCounter1()
    println(counter1)
    incementCounter1()
    println(counter1)

    //
    println("WITH FUNCTION")

    val count2 = countLambda()
    println(count2())
    println("PLUS") // 1
    println(count2())
    println("PLUS") // 2
    println(count2())
    println("PLUS") // 3

    //The the variable scope in lambda is very Good
    //So the power of lambdas to capture the scope if the really really important and you can see
}
//Example send operation like variable
fun printResult( a:Int, b:Int, operation :(Int, Int)-> Int){

    println(operation(a,b))
}

//Using Lambda Example

fun countLambda() :() -> Int {
    var count = 0

    val incrementCount :() -> Int = {
        count += 1
        count
    }

    return incrementCount
}



