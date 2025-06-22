package com.example.mytestapplication

//open keyword before the class keyword to make it extendable for the superclass
//val keyword to define the primary constructor parameters
open class SmartDevice protected constructor(val name: String, val category: String) {
    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            1 -> "online"
            2 -> "offline"
            else -> "unknown"
        }
    }

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}

fun main() {
    val smartTvDevice = SmartDevice("Android TV", "Television", 1)

    println("Device name is: ${smartTvDevice.name}")

    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}
