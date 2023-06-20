fun main(){
    var (a, b) = Pair("A", 1)
    println("$a, $b")

    val name = Pair("Raman", Pair("Ramanujan", Pair("Ramjan", 1)))

    println("${name.first} ${name.second}")

    // triple is used for inputting 3 variables
    val number = Triple("Hello", Triple(1, Triple("A", "B", true), 3), "Bye")
    println(number.second)
}