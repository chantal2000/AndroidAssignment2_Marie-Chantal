package com.example.kotlinactivityprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Family : AppCompatActivity() {
    lateinit var img:ImageView
    lateinit var tv:TextView
    lateinit var btnBack:Button
    lateinit var btnContinue:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)
        castViews()
        btnBack()
        btnContinue()
    }
        fun castViews() {
            img = findViewById(R.id.imgFam)
            tv = findViewById(R.id.tvFam)
            btnBack = findViewById(R.id.pre)
            btnContinue = findViewById(R.id.main)
        }

        fun btnBack() {
            btnBack.setOnClickListener {
                var intent = Intent(baseContext, God::class.java)
                startActivity(intent)
            }
        }

        fun btnContinue() {
            btnContinue.setOnClickListener {
                var intent = Intent(baseContext, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
