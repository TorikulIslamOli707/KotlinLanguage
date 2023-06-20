fun main(){
    // if condition
    var num: Int = 20
    if (num > 10){
        println("This is if statement")
    }

    // else condition
    if (num > 30){
        println("This is 2nd if statement")
    }else{
        println("This is an else statement")
    }

    // else if condition
    if (num > 30){
        println("This is 3rd if statement")
    }else if (num > 15){
        println("This is else if statement")
    }else{
        println("This is 2nd else statement")
    }

    // inline if else statement
    var msg = if (num > 10) "If statement will work" else "else statement will work"

    // when condition
    when (5){
        1 -> println("The value is 1")
        2 -> println("The value is 2")
        3 -> println("The value is 3")
        4 -> println("The value is 4")
        5 -> println("The value is 5")
        else -> println("The value is not present")
    }
}