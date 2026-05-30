class idgenerator{
    companion object{
        var currentId = 0
        fun getNextId() : Int{
            currentId++
            return currentId
        }
    }
}
fun main()
{
    println(idgenerator.getNextId())
    println(idgenerator.getNextId())
}
