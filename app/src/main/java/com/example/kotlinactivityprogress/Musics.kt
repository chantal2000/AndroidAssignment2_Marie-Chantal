package com.example.kotlinactivityprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Musics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musics)
        var img5=findViewById<ImageView>(R.id.img5)
        var img7=findViewById<ImageView>(R.id.img7)
        var tv4=findViewById<TextView>(R.id.tv4)
        var btn1=findViewById<Button>(R.id.btn5)
        var btn2=findViewById<Button>(R.id.btn6)
        btn1.setOnClickListener {
            var intent= Intent(baseContext,MyGoal::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            var intent=Intent(baseContext,God::class.java)
            startActivity(intent)
        }
    }
}