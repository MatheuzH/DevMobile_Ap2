package com.example.cuiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN)

        val botao = findViewById<Button>(R.id.button1)
        botao.setOnClickListener() {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}