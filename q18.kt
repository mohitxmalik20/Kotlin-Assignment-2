import kotlinx.coroutines.*
suspend fun fetchweather():String{
    delay(1000L)
    return "sunny"
}

fun main() = runBlocking {
    println(fetchweather())
    
}
