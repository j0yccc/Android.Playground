package com.example.mytestapplication

fun main() {
//    val trickFunction = trick()
//    To refer to the function as a value, reassign trickFunction to ::trick
//    val trickFunction = ::trick
//    val trickFunction = trick
//    trick()
//    trickFunction()
//    treat()
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()
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