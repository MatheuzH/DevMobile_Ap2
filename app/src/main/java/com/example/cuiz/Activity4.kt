package com.example.cuiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val botao1 = findViewById<ImageButton>(R.id.imageButton4)
        val botao2 = findViewById<ImageButton>(R.id.imageButton5)
        val botao3 = findViewById<ImageButton>(R.id.imageButton6)
        botao1.setOnClickListener() {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
        botao2.setOnClickListener() {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
        botao3.setOnClickListener() {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}