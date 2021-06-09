package com.example.kotlinactivityprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class God : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_god)
        var img=findViewById<ImageView>(R.id.imgJ)
        var tvJ=findViewById<TextView>(R.id.tvv)
        var btn1=findViewById<Button>(R.id.btnn)
        var btn2=findViewById<Button>(R.id.btnbb)

        btn1.setOnClickListener {
            var intent=Intent(baseContext,Musics::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            var intent=Intent(baseContext,Family::class.java)
            startActivity(intent)
        }
    }
}