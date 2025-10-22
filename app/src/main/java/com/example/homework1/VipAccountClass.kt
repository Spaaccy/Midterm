package com.example.homework1


class VIPAccount(
    accountNumber: String,
    ownerName: String,
    val transactionFee: Double = 2.0
) : Account(accountNumber, ownerName) {

    override fun withdraw(amount: Double) {
        val totalAmount = amount + transactionFee
        
        if (amount > 0 && getBalance() >= totalAmount) {
            super.withdraw(totalAmount)
            println("  (Includes transaction fee of $$transactionFee)")
        } else {
            if (amount <= 0) {
                println("✗ Withdrawal failed: Amount must be positive")
            } else {
                println("✗ Withdrawal failed: Insufficient funds (requires $$totalAmount including $$transactionFee fee)")
            }
        }
    }
}