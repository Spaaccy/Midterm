package com.example.homework1
open class Account(
    val accountNumber: String,
    val ownerName: String
) {
    private var balance: Double = 0.0

    fun getBalance(): Double {
        return balance
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("✓ Deposit successful: $$amount deposited to account $accountNumber")
        } else {
            println("✗ Deposit failed: Amount must be positive")
        }
    }

    open fun withdraw(amount: Double) {
        if (amount > 0 && balance >= amount) {
            balance -= amount
            println("✓ Withdrawal successful: $$amount withdrawn from account $accountNumber")
        } else {
            if (amount <= 0) {
                println("✗ Withdrawal failed: Amount must be positive")
            } else {
                println("✗ Withdrawal failed: Insufficient funds")
            }
        }
    }

    fun printInfo() {
        println("\nAccount Information")
        println("Account Number: $accountNumber")
        println("Owner Name: $ownerName")
        println("Current Balance: $${"%.2f".format(balance)}")
    }
}