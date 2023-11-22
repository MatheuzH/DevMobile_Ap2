package com.example.cuiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)


        val botao = findViewById<Button>(R.id.button_next2)
        botao.setOnClickListener() {
            val intent = Intent(this, Activity4::class.java)
            startActivity(intent)
        }
    }
}