package com.example.cuiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton

class Activity3 : AppCompatActivity() {
    private lateinit var score: Score
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN)

        val btn = findViewById<Button>(R.id.button)
        val rb1 = findViewById<RadioButton>(R.id.radioButton1)
        val rb2 = findViewById<RadioButton>(R.id.radioButton2)
        val rb3 = findViewById<RadioButton>(R.id.radioButton3)
        score = ScoreHolder.getScore()
        btn.setOnClickListener()
        {if(rb1.isChecked){
            score.adiciona_numero(1)
            val intent = Intent(this, Activity4::class.java)
            startActivity(intent)
        }
            if(rb2.isChecked){
                score.adiciona_numero(5)
                val intent = Intent(this, Activity4::class.java)
                startActivity(intent)
            }
            if(rb3.isChecked) {
                score.adiciona_numero(7)
                val intent = Intent(this, Activity4::class.java)
                startActivity(intent)
            }
            println(score.getNumber())
        }

    }


    override fun onResume() {
        super.onResume()

        val rb1 = findViewById<RadioButton>(R.id.radioButton1)
        val rb2 = findViewById<RadioButton>(R.id.radioButton2)
        val rb3 = findViewById<RadioButton>(R.id.radioButton3)
        score = ScoreHolder.getScore()

        if (rb1.isChecked) {
            score.remove_numero(1)
        }
        if (rb2.isChecked) {
            score.remove_numero(5)
        }
        if (rb3.isChecked) {
            score.remove_numero(7)
        }
    }
}