package com.example.mytestapplication

fun main() {
//    val trickFunction = trick()
//    To refer to the function as a value, reassign trickFunction to ::trick
//    val trickFunction = ::trick
//    val trickFunction = trick
//    trick()
//    trickFunction()
//    treat()

    //Lambda functions can be assigned to variables
    val coins1: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    //Shorter syntax for function type
    val coins: (Int) -> String = {
        "$it quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

//    val treatFunction = trickOrTreat(false, coins)
//    val trickFunction = trickOrTreat(true, null)
//    treatFunction()
//    trickFunction()

    //Pass a lambda expression directly into a function
    val treatFunction = trickOrTreat(false, { "$it quarters" })
    val trickFunction = trickOrTreat(true, null)
    repeat (4) {
        treatFunction()
    }
    trickFunction()

    //Use trailing lambda syntax
    //val treatFunction = trickOrTreat(false) { "$it quarters" }
}

fun trickOrTreat(isTrick: Boolean,  extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

fun trick() {
    println("No treats!")
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}