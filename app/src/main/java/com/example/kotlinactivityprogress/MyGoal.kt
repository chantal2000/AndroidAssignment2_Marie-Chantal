package com.example.kotlinactivityprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MyGoal : AppCompatActivity() {
    lateinit var img3: ImageView
    lateinit var tv2: TextView
    lateinit var btnBack: Button
    lateinit var btnContinue: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_goal)
        castViews()
        btnBack()
        btnContinue()
    }

    fun castViews() {
         img3 = findViewById(R.id.btn00)
         tv2 = findViewById(R.id.tv2)
         btnBack = findViewById(R.id.btnbtn)
         btnContinue = findViewById(R.id.btn4)
    }

    fun btnBack() {
        btnBack.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)

        }
    }
        fun btnContinue(){
            btnContinue.setOnClickListener {
                var intent = Intent(baseContext, Musics::class.java)
                startActivity(intent)
            }
        }
    }
