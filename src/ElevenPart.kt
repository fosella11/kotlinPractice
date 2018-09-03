fun main (args : Array<String>) {

    //Creating Class

    var student1 = Student("Max", "Devil")
    val student2 = Student("Fedex", "Doe")
    val student3 = Student("Jesi", "Dev")

    var student4 = Student("Max", "Devil")

    val student5 = Student("Max", "Devil")

    println(student1.fullName)

    //Comparing OBJECTS
    println(student1 === student3) //false

    student4 = student3
    println(student4 === student3) //true

    println(student1 === student5) //false

    student1 = student5
    println(student5 === student1) //true


    //Now we can check the students by data
    var studentData1 = StudentData("Max", "Devil")
    val studentData2 = StudentData("Max", "Devil")

    //return -- The student is duplicated
    if(studentData1 == studentData2){
        println("The student is duplicated")
    }else{
        println("Ok")
    }

    //Simple Practice with class : Sopping Store
    //We gonna create a 2 class one with the class items and other class with mutable List.

    println("""

       Exercise ----------------------------------

    """)

    val store1 = StoreItems("Macro Store")

    store1.addItems("Coffe",5)
    store1.addItems("Coffe",5)

    println(store1.storeItems.size)// 1 because the second element is in the list


    //Now We need to create a Singleton
    //The Singleton is used when you need to create a class and you don't want to create
    // a separate instances of the class



}

class Student (var firstName :String, var lastName :String){

    //Define methods
    val fullName
        get() = "$firstName $lastName"
}

//Kotlin has a data class that we can use to compare date and objects...

data class StudentData (var firstName: String, var lastName: String){

    val fullName
        get() = "$firstName $lastName"

}

/**
 * This method is used to create a item
 * @param name This is the name of itme
 * @param quantity  This is the numbers of items
 * @return int This returns sum of numA and numB.
 */
class Items (var name :String, var quantity :Int){}

/**
 * This method is used to create a item
 * @param name This is the name of itme
 * @param quantity  This is the numbers of items
 * @return int This returns sum of numA and numB.
 */
class StoreItems (var nameStore :String){

    var storeItems = mutableListOf<Items>()

    //We gonna create a function to add items because we should check if the item in the list before to add
    fun addItems(nameToAdd :String, quantityToAdd :Int){
        val checkedItem = this.storeItems.find {
            it.name == nameToAdd
        }
        //We must check if the result is null if not the item is in the list
        if(checkedItem == null){

            storeItems.add(Items(nameToAdd, quantityToAdd))

        }
    }

}