package com.salesforce

sealed class PersonEvent() {
    class Awake() : PersonEvent()
    class Sleeping() : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent) {
    when(event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Sleeping -> println("Sleeping")
        is PersonEvent.Eating -> println("Eating ${event.food}")
    }
}

fun main(args: Array<String>) {
    var event = PersonEvent.Eating("candy")

    handlePersonEvent(event)
}