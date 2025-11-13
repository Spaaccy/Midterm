package com.example.shoppingcart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MyCartActivity : AppCompatActivity() {
    private var quantity = 1
    private var productPrice = 0
    private lateinit var tvQuantity: TextView
    private lateinit var tvTotal: TextView
    private lateinit var subTotal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cart)

        productPrice = intent.getIntExtra("PRODUCT_PRICE", 0)

        tvQuantity = findViewById(R.id.tvQuantity)
        tvTotal = findViewById(R.id.tvTotal)
        subTotal = findViewById(R.id.subTotalCount)

        val btnMinus = findViewById<ImageView>(R.id.btnMinus)
        val btnPlus = findViewById<ImageView>(R.id.btnPlus)
        val btnPlaceOrder = findViewById<Button>(R.id.btnPlaceOrder)
        val btnBack = findViewById<ImageView>(R.id.btnBack)

        updateUI()

        btnMinus.setOnClickListener {
            if (quantity > 1) {
                quantity--
                updateUI()
            }
        }

        btnPlus.setOnClickListener {
            quantity++
            updateUI()
        }

        btnPlaceOrder.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun updateUI() {
        tvQuantity.text = quantity.toString()
        subTotal.text = "Subtotal (${quantity} items)"
        val total = productPrice * quantity
        tvTotal.text = "$total $"
    }
}