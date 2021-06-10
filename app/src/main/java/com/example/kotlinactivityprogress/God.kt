package com.example.kotlinactivityprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class God : AppCompatActivity() {
    lateinit var img: ImageView
    lateinit var tvJ: TextView
    lateinit var btnBack: Button
    lateinit var btnContinue: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_god)
        castViews()
        btnBack()
        btnContinue()
    }

    fun castViews() {
         img = findViewById(R.id.imgJ)
         tvJ = findViewById(R.id.tvv)
         btnBack = findViewById(R.id.btnn)
         btnContinue = findViewById(R.id.btnbb)
    }

    fun btnBack() {
        btnBack.setOnClickListener {
            var intent = Intent(baseContext, Musics::class.java)
            startActivity(intent)
        }
    }
   fun btnContinue()
    {
        btnContinue.setOnClickListener {
            var intent = Intent(baseContext, Family::class.java)
            startActivity(intent)
        }
    }

}