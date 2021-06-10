package com.example.kotlinactivityprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Musics : AppCompatActivity() {
    lateinit var img5:ImageView
    lateinit var img7:ImageView
    lateinit var tv4:TextView
    lateinit var btnBack:Button
    lateinit var btnContinue:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musics)
        castViews()
        btnBack()
        btnContinue()
    }
    fun castViews() {
         img5 = findViewById(R.id.img5)
         img7 = findViewById(R.id.img7)
         tv4 = findViewById(R.id.tv4)
         btnBack = findViewById(R.id.btn5)
         btnContinue = findViewById(R.id.btn6)
    }
    fun btnBack() {
        btnBack.setOnClickListener {
            var intent = Intent(baseContext, MyGoal::class.java)
            startActivity(intent)
        }
    }
    fun btnContinue(){
        btnContinue.setOnClickListener {
            var intent=Intent(baseContext,God::class.java)
            startActivity(intent)
        }
    }
}
