package com.example.kotlinactivityprogress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MyGoal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_goal)
        var img3=findViewById<ImageView>(R.id.btn00)
        var tv2=findViewById<TextView>(R.id.tv2)
        var btn7=findViewById<Button>(R.id.btnbtn)
        var btn4=findViewById<Button>(R.id.btn4)
   btn7.setOnClickListener {
    var intent= Intent(baseContext,MainActivity::class.java)
    startActivity(intent)

}
        btn4.setOnClickListener {
            var intent=Intent(baseContext,Musics::class.java)
            startActivity(intent)
        }
    }
}