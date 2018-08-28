fun main(args :Array<String>){

    //How to use Sets

    val names = setOf("Tomato","Carrot","Banana")

    val numbers = arrayOf(1,2,3,5,6,7)

    //We can set the numbers

    //val numbersSet = setOf(numbers)
    //We can't set the array without the reference """" * """"

    val numbersSet = setOf(*numbers)

    println(numbersSet)

    //Functions contain 5
    println(numbersSet.contains(5)) //true

    //other method
    println(5 in numbersSet) //true

    //If we need modify we need to use mutable

    val numbersSetMut = mutableSetOf(*numbers)

    //Now we can modify, for example remove elements
    // Remove element not index
    numbersSetMut.remove(1)

    println(numbersSetMut) // 2,3,4,5,6,7


    //Exercise time!!!!

    val numb = arrayOf(1,2,3,4,1,1,2,33,4,4,4,4,4,4,4,4,2,6,5,8,7,9,9,10)

    //We can use the power of SET to remove duplicated numbers from array :)
    val set = setOf(*numb)

    val removeDuplicatedNumb = set.toIntArray()

    //
    println("Print numbers of set: $set")
    for (index in 0 until removeDuplicatedNumb.size)
        println(removeDuplicatedNumb[index])
}
