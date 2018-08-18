fun main (args : Array<String>) {

    var a = 50
    val a1 = "fede"
    a++

    var i = 0
    var j = 0
    while (i < 5) {
        i++
        println("The number is :" + i)
        while (j < 5) {
            j++
            print(j)
        }
        j = 0
    }


    print("First lines on Kotlin !! :)" + "Var" + a + "Val: " + a1.compareTo("fede").toString())


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


    //Pairs and Triples

    val coordinates = Pair(3, 5)
    val coordinatesOtherForm = 3 to 5

    val (x, y) = coordinates

    println("We can use this form to get values and use: First: $x , Second: $y ")
    println("Or we can use this form, basically First: " + coordinatesOtherForm.first
            + " Second: " + coordinatesOtherForm.second)

    // If we need 3 values for example x,y,z We can use the Triple Similar to Pair

    val coordinater3D = Triple(20, 30, 40)

    val (x1, y1, z1) = coordinater3D

    println("Coordinate 3D: First: ${coordinater3D.first}, Second: ${coordinater3D.second} , Third: ${coordinater3D.third} ")


    //Conditionals If we want to check the number is multiple of 3 and use the Fizz to write multiples of 3 and Buzz to
    //write multiples of 5 ... :)

    println("""
       ---------------- Test
        --------------- Test
        --------------- Fizz Buzz ------------------
    """)

    val testTo = 100

    for (i in 0..testTo){
    if (i % 5 == 0 && i % 3 == 0) {
        print("$i is: Fizz & Buzz || ")
    }else if (i % 3 == 0){
        print("$i is: Fizz || ")
    }else if (i % 5 == 0){
        print("$i is: buzz || ")
    }else{
        print("$i isn't: FIZZ AND BUZZ || ")
    }
    }
}