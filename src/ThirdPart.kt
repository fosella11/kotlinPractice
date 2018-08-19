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

}