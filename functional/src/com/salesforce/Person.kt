package com.salesforce

open class Person(first: String, last: String) {
    var firstName: String = first
    var lastName: String = last

    open fun getName() : String = "$firstName $lastName"
}

class Student(first: String, last: String) : Person(first, last) {
    override fun getName() : String = ""
}