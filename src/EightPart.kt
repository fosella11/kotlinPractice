fun main (args :Array<String>){

    //Maps

    var nameOfCountries = mapOf("one" to "Argentina", "two" to "NewZealand", "three" to "Japan")

    //We cant't use mapOf to modify
    //nameOfCountries.remove

    //We can use mutable
    var nameOfCountriesMutable = mutableMapOf("one" to "Argentina", "two" to "NewZealand", "three" to "Japan")

    println(nameOfCountriesMutable)
    //Remove a item of map with 1 parameter
    nameOfCountriesMutable.remove("three")
    println(nameOfCountriesMutable)

    //add new item
    nameOfCountriesMutable["three"] = "Spain"
    println(nameOfCountriesMutable)

    //Remove a item of map with 2 parameter
    nameOfCountriesMutable.remove("three", "Spain")
    println(nameOfCountriesMutable)

    //When the value isn't in Map return null
    println(nameOfCountriesMutable["abcd"])
    //return null

    //Change item
    nameOfCountriesMutable["one"] = "Argentina Change"

    println(nameOfCountriesMutable)


    //loop to print all element on Map
    for ((itemIndex, itemName) in nameOfCountriesMutable){

        println("$itemIndex - $itemName")

    }

    println("Print keys of Map")
    //loop to print all element on Map
    for (key in nameOfCountriesMutable.keys){

        println("$key")

    }

}