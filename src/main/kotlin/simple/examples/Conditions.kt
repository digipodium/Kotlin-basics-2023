package simple.examples

fun checkLeapYear(year: Int): Boolean{
    return if (year % 4 == 0) { // number is divisible by 4
        if (year % 100 == 0) { // number is divisible by 100
            year % 400 == 0 // number is divisible by 400
        }else{
            true
        }
    }else{
        false
    }
}

fun getInterestRate(principalAmt: Int = 12000): Double{
    return when (principalAmt){
        in 0..10000 -> 5.0
        in 10001..20000 -> 6.0
        in 20001..30000 -> 7.0
        else -> 8.0
    }
}

fun simpleInterest( p: Int, t:Int): Double{
    val r = getInterestRate(p)
    return p * r * t / 100
}

fun main() {
    val year = readln().toInt()
    val out = checkLeapYear(year)
    println("Is $year a leap year? $out")
    val si = simpleInterest(20000, 5)
    println("Simple Interest: $si")
}