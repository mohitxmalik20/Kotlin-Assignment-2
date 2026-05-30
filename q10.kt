sealed class ScreenState
object Loading : ScreenState()
data class Success(val data: String) : ScreenState()
fun main(){
    val st1 = Loading
    val st2 = Success("data")
    println(st1)
    println(st2)
}
