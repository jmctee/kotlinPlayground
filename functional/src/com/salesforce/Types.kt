package com.salesforce

interface Time {
    fun setTime(hours: Int, minutes: Int = 0, seconds: Int = 0)
    fun setTime(time: JeklTime) = setTime(time.hours, time.minutes, time.seconds)
}

class JeklTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class YetiTime: Time {
    override fun setTime(hours: Int, minutes: Int, seconds: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
