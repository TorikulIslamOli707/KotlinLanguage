fun main(){
    // for loop upto a range
    for (i in 0..10){
        print("$i ")
    }

    println()
    // for loop before a range of number
    for (i in 0 until 10){
        print("$i ")
    }
    println()

    // for loop in reverse order
    for (i in 10 downTo 0){
        print("$i ")
    }
    println()
    // for loop change the default step count
    for (i in 10 downTo 1 step 3){
        print("$i ")
    }

    var num = 10

    while(num > 0){
        print("$num ")
        num--
    }
    println()
    do{
        print("I will execute no matter what happened.")
    }while(num > 0)
}