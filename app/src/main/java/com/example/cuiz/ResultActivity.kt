package com.example.cuiz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var score: Score
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        score = ScoreHolder.getScore()

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN)

        val img = findViewById<ImageView>(R.id.imageView)
        val btn = findViewById<Button>(R.id.voltarMain)
        val textView = findViewById<TextView>(R.id.textView)
        val linkTextView = findViewById<TextView>(R.id.linktextView)
        val linkTextView2 = findViewById<TextView>(R.id.textView3)

        val value = score.getNumber()


        when {
            value <= 14 -> {
                textView.text = "Você é a Elisa sanches!"
                img.setImageResource(R.drawable._7012022060727_whatsapp_i)
                linkTextView.text = "Instagram Elisa"
                linkTextView.setOnClickListener {
                    val webpage = Uri.parse("https://instagram.com/elisasanchesreall")
                    val intent = Intent(Intent.ACTION_VIEW, webpage)
                    startActivity(intent)
                }
                linkTextView2.text = "Ligar para Elisa!"
                linkTextView2.setOnClickListener {
                    val intent = Intent(Intent.ACTION_DIAL).apply {
                        data = Uri.parse("tel:$5521961729191")
                    }
                    startActivity(intent)
                }
            }

            value > 15 && value <= 20 -> {
                textView.text = "Você é a Mia Khalifa"
                img.setImageResource(R.drawable.mia_khalifa)
                linkTextView2.visibility = View.GONE
                linkTextView.text = "Instagram Mia Khalifa"
                linkTextView.setOnClickListener {
                    val webpage = Uri.parse("https://www.instagram.com/miakhalifa.w")
                    val intent = Intent(Intent.ACTION_VIEW, webpage)
                    startActivity(intent)
                }
            }

            value >= 21 -> {
                textView.text = "Você é a Tigresa Vip"
                img.setImageResource(R.drawable.ab79b7843da5a54a877b1d6757d837ac)
                linkTextView.text = "Instagram Tigresa Vip"
                linkTextView2.visibility = View.GONE
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