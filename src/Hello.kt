fun main(args: Array<String>){
    println("Hello World!!")

    var list = mutableListOf(1,2,3)
    var doubledNumbers = list.map { it*2 }
    println(doubledNumbers)

    var farewell = Bye()
    farewell.printFarewell()
}
