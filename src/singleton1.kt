fun main() {
    Singleton.printName()
    Singleton.name=" kk "
    var  a=A() }

object Singleton {

    init{ println("Singleton class invoked.") }

    var name="Kotlin Objects"


    fun printName(){
        println(name)
    }
}
class A{
    init {
        println("class init method .Singleton name property :${Singleton.name}")
        Singleton.printName()
    }
}
