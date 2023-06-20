fun main(){
    println("Function declaration only: ${demo()}")
    println("Function returning specific type of value: ${demo2()}")
    println("Function returning any type of value: ${demo3()}")
    println("Function with parameter: ${add(2, 3)}")
    println("Function overriding: ${add(1, 2, 3)}")
}

// function declaration
fun demo(){

}

// function return type
fun demo2(): String{
    return "Returning value."
}

// function returning any type of value
fun demo3(): Any{
    return 3.3334
}

// function with parameter
fun add(a: Int, b: Int): Int{
    return a + b
}

// function overriding
fun add(a: Int, b: Int, c: Int): Any{
    return (a + b + c) / 3
}