fun main(args :Array<String>){

    //How to use array in loop
    val array = arrayOf(4,5,8,5,"fede","Raul",5.5,222)

    // for (index in 0..array.size -1) We can use UNTIL

    for (i in 0 until array.size){
        println(array[i])
    }

    //Other form to define Array
    //ForExample even numbers only integers 2,4,6,8,10 PARES
    val evenNumbers = intArrayOf(2,4,6,8,10)

    //Define size of array
    val arrayWithSize = Array(5, {"fede"})

    //When we need to use the all functionality of array we have to use the mutable (Variable)

    val admins = listOf("pepe","fede","Mary","Peter")

    // admins.add if the list not mutable we can't add but we can use the other method (last, fist, slice)

    val newUserList = mutableListOf<String>()

    newUserList.add("Fede")
    newUserList.add("John")
    newUserList.add("Peter")
    newUserList.add("Max")

    //GetLast
    println(newUserList.last()) // Max
    println(newUserList.first()) // Fede
    newUserList.removeAt(0)
    println(newUserList.first()) // John
    newUserList.set(0, "Fede")
    println(newUserList.first()) //Fede
    val sliceList = newUserList.slice(1..2) // Return a list with Peter and John
    println(sliceList.first()) //Peter

    //Testing function findTheName using List
    println(findTheName("Peter", admins)) //true
    println(findTheName("Juan", admins)) //false
    println(findTheName1("Peter", admins)) //true
    println(findTheName1("Juan", admins)) //false



    //We can to test short the list with number
    var numberAleatories0 = mutableListOf(41,1,58,69,54,5,88,745,1,2,3,4,5,6,7,8,9)

    //method
    sort(numberAleatories0)
    println(numberAleatories0)
}


//Exercise Finding a name in the array
fun findTheName(name :String, list :List<String>) :Boolean{
    var found = false
    for (index in 0 until list.size){
        if (name == list[index]){
            found = true
            break
        }
    }
    return found
}

//Similar function
fun findTheName1 (name :String, list: List<String>) :Boolean{
    return name in list
}

fun sort(mutableListToSort :MutableList<Int>){
    for (i in 0 until mutableListToSort.size){
        for (j in i+1 until mutableListToSort.size){
            val temp = mutableListToSort[i]
            if(temp > mutableListToSort[j]){
                mutableListToSort[i] = mutableListToSort[j]
                mutableListToSort[j] = temp
            }
        }
    }
}

