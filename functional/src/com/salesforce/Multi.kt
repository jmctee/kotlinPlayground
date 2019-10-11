package com.salesforce

interface A {
    fun doSomething() { println("A")}
}

interface B {
    fun doSomething() { println("B")}
}

class C : A, B {
    override fun doSomething() {
        super<A>.doSomething()
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.doSomething()
}