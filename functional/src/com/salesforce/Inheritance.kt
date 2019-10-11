package com.salesforce

open class D {
    open fun doSomething() { println("D")}
}

class E : D() {
    override fun doSomething() {
        super.doSomething()
        println("E")
    }
}

abstract class F {
    open fun doSomething() { println("F")}
    abstract fun doSomethingElse()
}

class G : F() {
    override fun doSomethingElse() {
        println("G")
    }

}

fun main(args: Array<String>) {
    var e = E()
    e.doSomething()

    var g = G()
    g.doSomething()
    g.doSomethingElse()
}