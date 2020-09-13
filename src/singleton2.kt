class A2{
    init {
        println("class init method .Singleton name property ")
        Singleton.printName()
    }
}

object Singleton2 {
    init {
        println("Singleton1 class invoked")
    }

    var name = "Kotlin Objects 1"


    fun printName() {
        println(name)

    }
}
fun main()
{
    var a=A()
}