abstract class Animal
{
    abstract fun makesound()
}
class cat : Animal()
{
    override fun makesound()
    {
        println("meoww")
    }
}
fun main(){
    val a = cat()
    a.makesound()
}
