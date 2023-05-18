package com.example.he

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var GoProfile = findViewById(R.id.GoProfile) as CardView
        var GoCourse = findViewById(R.id.GoCourse) as CardView
        var GoExe = findViewById(R.id.GoExe) as CardView
        var GoPuz = findViewById(R.id.GoPuz) as CardView
        var GoQuiz = findViewById(R.id.GoQuiz) as CardView

        GoProfile.setOnClickListener{
            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
        GoCourse.setOnClickListener{
            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
        GoExe.setOnClickListener{
            val intent = Intent(this,Exe ::class.java)
            startActivity(intent)
        }
        GoPuz.setOnClickListener{
            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
        GoQuiz.setOnClickListener{
            val intent = Intent(this,Quiz ::class.java)
            startActivity(intent)
        }

    }
}