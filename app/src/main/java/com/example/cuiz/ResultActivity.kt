package com.example.cuiz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var score: Score
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        score = ScoreHolder.getScore()


        val img = findViewById<ImageView>(R.id.imageView)
        val btn = findViewById<Button>(R.id.voltarMain)
        val textView = findViewById<TextView>(R.id.textView)
        val linkTextView = findViewById<TextView>(R.id.linktextView)

        val value = score.getNumber()


        when {
            value <= 10 -> {
                textView.text = "Você é a Elisa sanche!"
                img.setImageResource(R.drawable._7012022060727_whatsapp_i)
                linkTextView.text = "Instagram Elisa"
                linkTextView.setOnClickListener {
                    val webpage = Uri.parse("https://instagram.com/elisasanchesreall")
                    val intent = Intent(Intent.ACTION_VIEW, webpage)
                    startActivity(intent)
                }
            }

            value > 10 && value <= 15 -> {
                textView.text = "Você é a Mia Khalifa"
                img.setImageResource(R.drawable.mia_khalifa)
                linkTextView.text = "Instagram Mia Khalifa"
                linkTextView.setOnClickListener {
                    val webpage = Uri.parse("https://www.instagram.com/miakhalifa.w")
                    val intent = Intent(Intent.ACTION_VIEW, webpage)
                    startActivity(intent)
                }
            }

            value >= 16 -> {
                textView.text = "Você é a Tigresa Vip"
                img.setImageResource(R.drawable.ab79b7843da5a54a877b1d6757d837ac)
                linkTextView.text = "Instagram Tigresa Vip"
                linkTextView.setOnClickListener {
                    val webpage = Uri.parse("https://instagram.com/tigresavipvideos")
                    val intent = Intent(Intent.ACTION_VIEW, webpage)
                    startActivity(intent)
                }
            }

        }


        btn.setOnClickListener{
            score.setNumero(0)
            score.setNumero2(0)
            score.setNumero3(0)

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}