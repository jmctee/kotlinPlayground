@file:JvmName("KotlinTests")

import com.salesforce.Person

import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {
    val joe = Person("Iggy", "Pop")

    println(joe.firstName)
    println(joe.lastName)
    println(joe.getName())

//    joe.display()
//    joe.displayWithLambda(::display)

//    doit(1, 2)
//    doit(3)
//    doit(arg2 = 1, arg1 = 2)
}

@JvmOverloads
fun doit(arg1: Int, arg2: Int = 3) {
    println("$arg1 $arg2")
}

fun display(s: String) {
    println(s)
    var question = Question()
// OR
//    var question:Question = Question()
//    question.answer = "Moar Shtuff"

    if (question.answer == null) {
        question.answer = "Shtuff"
    }
//    question.question = "" // <== can't do this
    question.display()

    println("The answer to the question ${question.question} is ${question.answer}")

//    if (question.answer == question.correctAnswer) {
//        println("You were correct")
//    }
//    else {
//        println("Bzzzzzzzt!!!")
//    }


//    val message = if (question.answer == question.correctAnswer) {
//        "You were correct"
//    }
//    else {
//        "Bzzzzzzzt!!!"
//    }

    question.printResult();

    val number:Int? = try {
        Integer.parseInt("42")
    }
    catch (e:NumberFormatException) {
        null
    }

    println("Number is $number")

//    while(true) {
//
//    }
//
//    do {
//
//    } while (true)

    for(ii in 1..10 step 5) {
//    for(ii in 10 downTo 1 step 5) {
//    for(ii in 1 until 10) {
        println(ii)
    }

    var list = listOf<Int>(1, 2, 3)
    for (ii in list) {
        println(ii)
    }

    var ages = TreeMap<String, Int>()
    ages["Iggy"] = 42
    ages["Horatio"] = 23
    ages["Wilhelmina"] = 33

//    for(ii in ages) {
//        println("${ii.key} -> ${ii.value}")
//    }

    for((name, age) in ages) {
        println("$name -> ${age + 1}")
    }

    for ((index, element) in list.withIndex()) {
        println("$index -> ${element + 3}")
    }

    for(ii in 'a'..'c') {
        println(ii)
    }
}

class Question {
    // ? means nullable
    var answer:String? = null
    val question:String = "Wut???"
    val correctAnswer = "Moar Shtuff"

    fun display() {
        println("You said $answer")
    }

    fun printResult() {
//        val message = if (answer == correctAnswer) {
//            "You were correct"
//        }
//        else {
//            "Bzzzzzzzt!!!"
//        }
//
//        println(message)

        when (answer) {
            correctAnswer -> println("You were correct")
            else -> println("Bzzzzzzzt!!!")
        }
    }
}