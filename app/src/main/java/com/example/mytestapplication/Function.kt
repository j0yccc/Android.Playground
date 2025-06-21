package com.example.mytestapplication

fun main() {
    trafficLight()
    primeNumber(2)
    primeNumber1(4)
    primeNumber2(20)
    trafficLightExpression()

    nullSafeString()
    nullSafeInt()
    nullCheck()
    nullCheckExpression()
    nullCheckElvisOperator()
}
/*This is a simple Kotlin program that demonstrates the use of `when` expressions to handle different cases.*/
fun trafficLight(){
    val trafficLightColor = "Amber"

    when(trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid color")
    }
}

fun primeNumber(x: Int) {

    when(x) {
        2 -> println("$x is a prime number between 1 and 10")
        3 -> println("$x is a prime number between 1 and 10")
        5 -> println("$x is a prime number between 1 and 10")
        7 -> println("$x is a prime number between 1 and 10")
        else -> println("$x is not a prime number between 1 and 10")
    }
}

fun primeNumber1(x:Int) {
    when (x) {
        2,3,5,7 -> println("$x is a prime number between 1 and 10")
        in 1..10 -> println("$x is a number between 1 and 10, but not a prime number.")
        else -> println("$x is not a prime number between 1 and 10")
    }
}

fun primeNumber2(x: Any) {
    when (x) {
        2, 3, 5, 7 -> println("$x is a prime number between 1 and 10")
        in 1..10 -> println("$x is a number between 1 and 10, but not a prime number.")
        is Int -> println("$x is an integer, but not a prime number between 1 and 10")
        else -> println("$x is not an integer")
    }
}

fun trafficLightExpression() {
    val trafficLightColor = "Amber"

    val message = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid color"
    }

    println(message)
}

// This Kotlin program demonstrates the use of null safety features, including nullable types, safe calls, and the not-null assertion operator.
fun nullSafeString() {
    var favActor: String? = "Sarah Oh"
    println(favActor)
    println(favActor?.length)
    println(favActor!!.length)

    favActor = null
    println(favActor)
    println(favActor?.length)
    //println(favActor!!.length) //This Kotlin error shows that your program crashed during execution. As such, it's not recommended to use the !! not-null assertion operator unless you're sure that the variable isn't null.
}

fun nullSafeInt() {
    var favNumber: Int? = 10
    println(favNumber)

    favNumber = null
    println(favNumber)

}

fun nullCheck() {
    var favoriteActor: String? = null

    if (favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }

}

fun nullCheckExpression() {
    var favouriteActor: String? = null

    val lengthOfName = if (favouriteActor != null) {
        favouriteActor.length
    } else {
        0
    }
    println("The number of characters in your favourite actor's name is $lengthOfName.")
}

fun nullCheckElvisOperator() {
    var favouriteActor: String? = "Sarah Oh"

    // val name = nullable variable?.method/property ?: default value
    val lengthOfName = favouriteActor?.length ?: 0
    println("The number of characters in your favourite actor's name is $lengthOfName.")
}
/*A variable can be set to null to indicate that it holds no value.
Non-nullable variables cannot be assigned null.
Nullable variables can be assigned null.
To access methods or properties of nullable variables, you need to use ?. safe-call operators or !! not-null assertion operators.
You can use if/else statements with null checks to access nullable variables in non-nullable contexts.
You can convert a nullable variable to a non-nullable type with if/else expressions.
You can provide a default value for when a nullable variable is null with the if/else expression or the ?: Elvis operator.*/