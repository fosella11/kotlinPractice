fun main (args : Array<String>){

    var a = 50
    val a1 = "fede"
    a++

    var i = 0
    var j = 0
    while (i<5){
        i++
        println("The number is :"+ i)
        while (j<5){
            j++
            print(j)
        }
        j = 0
    }


    print("First lines on Kotlin !! :)"+"Var"+a+"Val: "+a1.compareTo("fede").toString())


    //Multiline

    var bigString = """

        Writing Line 1
        and line 2
        and line 3
        This is a big string with multiline! Perfect!!!

        """
    println(bigString)


    //And then I can to inject values and operations
    // for example multiply tow numbers

    val ma = 25
    val mb = 100

    bigString += "And the multiply of a * b is: ${ma * mb}"

    println(bigString)


}