fun main (args: Array<String>){

    //Nullabilities kotlin

    var number: Int?
    var str: String? = "This is a string and this string can to be a Null"
    var strNoNull: String = "This is a string and this string can to be a Null"

    // strNoNull = null That is impossible
    // But
    str = null // That is possible because is defined before

    number = 1

    //For example if We have a definition
    var numberNullAndInit: Int? = 45

    // numberNullAndInit += 2 This is impossible because the value can be null
    // and we must 100% secure that the number won't be null
    // For example

    //With !! We know that the value is nullable
    // Be careful with !! (100% Secure)
    numberNullAndInit = numberNullAndInit!! + 2

    println(numberNullAndInit)

    //Other for to use nullable

    var numberToParse: Int?

    numberToParse = "55".toIntOrNull()

    println("Not Null $numberToParse")

    numberToParse = "fghjk".toIntOrNull()

    println("Probability Null $numberToParse")


    //Smart cast
    var theName: String? = "Fede"
    var theAge: Int? = 21

    /*As I added the condition in the smart Chec (theAge != null) I can to use the variable without
     theAge = theAge!! + 2
     Is better
    --------------------
    THIS IS DANGEROUS
     theAge = theAge!! + 2 --->>> USE the smart check
    --------------------
    */

    if(theName != null && theAge != null){

        theAge += 4
        println("The name is : $theName and the Age is : $theAge")
    }else{
        println("The values is NUll -- Safe")
    }

    //Safe Calls
    var middleName :String? = "Fede"

    //First with Smart Check
    if(middleName != null){
        println(middleName.length)
    }
    //Other form to check
    println(middleName?.length)

    //Other form to check
    middleName?.let {
        val len = it.length
        println("$it and the size is: $len")
    }

    //Elvis Operator :)

    var age1 :Int? = 10
    // We can use the elvis operator to assign a value and if the value
    // is null, to return 0
    val result1 = age1 ?: 0
    println("When the value isn't null: $result1")

    age1 = null
    val result2 = age1 ?: 0
    println("When the value is null: $result2")


    //------

}