package com.example.kotlinactivityprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCon: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        btnCon()
    }
        fun castViews() {
            btnCon = findViewById(R.id.btn1)
        }
        fun btnCon() {
            btnCon.setOnClickListener {
                var intent = Intent(baseContext, MyGoal::class.java)
                startActivity(intent)
            }
        }
    }
