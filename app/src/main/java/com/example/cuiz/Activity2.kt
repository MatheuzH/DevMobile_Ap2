package com.example.cuiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        val botao = findViewById<Button>(R.id.button_next1)
        botao.setOnClickListener() {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }

    }
}