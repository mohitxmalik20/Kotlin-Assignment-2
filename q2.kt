class Thermostst {
    private var temperature:Double=0.0

    fun modtemp(value:Double) {
        temperature=value
    }
    fun showtemp()
    {
        println("Temperature is now set to $temperature")
    }
}
fun main()
{
    val t= Thermostst()
    t.modtemp(45.0)
   t.showtemp()
}
