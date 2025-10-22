package com.example.homework1


class SavingsAccount(
    accountNumber: String,
    ownerName: String
) : Account(accountNumber, ownerName) {

    override fun withdraw(amount: Double) {
        if (amount > 500) {
            println("✗ Withdrawal failed: Transaction limit is $500. You tried to withdraw $$amount")
        } else {
            super.withdraw(amount)
        }
    }
}