package com.example.cuiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton

class Activity5 : AppCompatActivity() {
    private lateinit var score: Score
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN)

        val imgbtn = findViewById<ImageButton>(R.id.imageButton4)
        val imgbtn2 = findViewById<ImageButton>(R.id.imageButton5)
        val imgbtn3 = findViewById<ImageButton>(R.id.imageButton6)

        score = ScoreHolder.getScore()
        imgbtn.setOnClickListener() {
            score.adiciona_numero(1)
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
        imgbtn2.setOnClickListener() {
            score.adiciona_numero(5)
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
        imgbtn3.setOnClickListener() {
            score.adiciona_numero(7)
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }

}