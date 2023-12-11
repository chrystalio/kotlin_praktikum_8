package com.example.praktikum8

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnClickMe2 = findViewById<Button>(R.id.btnClickMe2)

        btnClickMe2.setOnClickListener {
            finish()
        }
    }
}