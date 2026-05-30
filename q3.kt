open class Vehicle{
    open fun startEngine() {
        println("Start Engine!!")
    }
}
class motorcycle : Vehicle(){
    override fun startEngine()
    {
        println("Vroom!!")
    }
}
fun main()
{
    val bike = motorcycle()
    bike.startEngine()
}
