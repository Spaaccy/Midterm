package com.example.homework1

fun main() {
    println("BANKING SYSTEM TEST PROGRAM")

    val savings = SavingsAccount("S101", "George G.")
    val vip = VIPAccount("V202", "Mariam A.")

    println("Testing Deposits")
    savings.deposit(1000.0)
    vip.deposit(1000.0)

    println("\nTesting Savings Account Withdrawal Limit")
    println("Attempting to withdraw $600 (exceeds $500 limit):")
    savings.withdraw(600.0)
    
    println("\nAttempting to withdraw $400 (within limit):")
    savings.withdraw(400.0)

    println("\nTesting VIP Account Transaction Fee")
    println("Attempting to withdraw $100 (total cost: $102 with fee):")
    vip.withdraw(100.0)
    
    println("\nAttempting to withdraw $200:")
    vip.withdraw(200.0)

    println("\nTesting Insufficient Funds")
    println("Attempting to withdraw $800 from VIP account (balance insufficient):")
    vip.withdraw(800.0)

    println("FINAL ACCOUNT STATES")
    savings.printInfo()
    vip.printInfo()
}