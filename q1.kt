class BankAccount {
    private var balance: Double = 0.0

    fun deposite(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Amount = $amount")
            println("Balance = $balance")
        } else {
            println("invalid amount $amount")
        }
    }
}
fun main()
{
    val acc=BankAccount()
    acc.deposite(40.0)
    acc.deposite(15.0)
}
