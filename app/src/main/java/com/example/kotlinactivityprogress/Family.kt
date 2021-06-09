package com.example.kotlinactivityprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Family : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)
        var img=findViewById<ImageView>(R.id.imgFam)
        var tv=findViewById<TextView>(R.id.tvFam)
        var btn1=findViewById<Button>(R.id.pre)
        var btn2=findViewById<Button>(R.id.main)
        btn1.setOnClickListener {
            var intent=Intent(baseContext,God::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}